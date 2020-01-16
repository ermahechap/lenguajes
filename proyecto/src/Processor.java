import java.util.*;
import Utilities.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class NextAtomExpr extends Python3BaseListener { // Class intended to get the next atom_expr on the tree (avoids atom_expr under the one already found)
    public ArrayList<Python3Parser.Atom_exprContext> atom_expr_ctxs = new ArrayList<>();

    int testCount = 0;
    @Override
    public void enterTest(Python3Parser.TestContext ctx) {
        this.testCount++;
    }
    @Override
    public void exitTest(Python3Parser.TestContext ctx) {
        this.testCount--;
    }

    @Override
    public void enterAtom_expr(Python3Parser.Atom_exprContext ctx){
        if(testCount >1) return;
        this.atom_expr_ctxs.add(ctx);
    }
}

public class Processor extends Python3BaseListener {
    private Root root;
    public Scope currentScope; // namespaces - like a stack, but not a stack(because keeps references to its subscopes(aka. child scopes)) :v
    public Node currentNode; // not necessarly a scope (it could be an if, a for, etc....)

    public int lockBranchCounter = 0;

    public String []globalScope = {
        "abs", "all", "min", "str", "zip" // take the others from here https://docs.python.org/3/library/functions.html
    };


    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx) {
        this.root = Root.getRootInstance();
        this.currentScope = new Scope(null, this.root);
        this.currentNode = this.root;
    }

    @Override
    public void exitFile_input(Python3Parser.File_inputContext ctx) {
        Node.nodeDump.forEach((n) -> System.out.println(n.show())); // uses nodedump which is static
    }


    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        if(!ctx.getTokens(Python3Parser.ASSIGN).isEmpty()) { // variable assign
            int n_testlist_star = ctx.testlist_star_expr().size();
            Node assignNode = null;
            for(int i = n_testlist_star - 1; i >=0; i--) {
                Python3Parser.Testlist_star_exprContext t_ctx = ctx.testlist_star_expr(i);
                Pair<Integer, Integer> from = new Pair<Integer, Integer>(t_ctx.start.getLine(), t_ctx.start.getCharPositionInLine());
                Pair<Integer, Integer> to = new Pair<Integer, Integer>(t_ctx.stop.getLine(), t_ctx.stop.getCharPositionInLine());


                if(i == n_testlist_star - 1 && n_testlist_star != 1){
                    assignNode = new Node(this.currentNode, from, to);
                    assignNode.type = "composed";

                    for(Python3Parser.TestContext test_ctx : t_ctx.test()){
                        Node assignNodeElement = new Node(assignNode, from, to);
                        assignNodeElement.type = "composed_element";

                        ParseTreeWalker walker = new ParseTreeWalker();
                        NextAtomExpr sb = new NextAtomExpr();
                        walker.walk(sb, test_ctx);
                        for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs) {
                            processAtomExpr(atom_expr_ctx, assignNodeElement, null);
                        }
                        assignNode.addChild(assignNodeElement);
                    }

                } else {
                    boolean isSplitable = (t_ctx.test().size() == assignNode.children.size() && n_testlist_star > 1);
                    int id = 0;
                    for(Python3Parser.TestContext test_ctx : t_ctx.test()){
                        ParseTreeWalker walker = new ParseTreeWalker();
                        NextAtomExpr sb = new NextAtomExpr();
                        walker.walk(sb, test_ctx);
                        for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs) {
                            if(isSplitable){
                                processAtomExpr(atom_expr_ctx, this.currentNode, assignNode.children.get(id++));
                            }
                            else
                                processAtomExpr(atom_expr_ctx, this.currentNode, assignNode);
                        }
                    }


                }

            }
        }
        /*
        * Otherwise, it is just variable call -> dealt later by the overridden method enterAtom_expr
        */
    }

    @Override
    public void enterAtom_expr(Python3Parser.Atom_exprContext ctx) {
        if(this.lockBranchCounter > 0) return;
        processAtomExpr(ctx, this.currentScope.getScopeNode(), null);

    }
    @Override
    public void exitAtom_expr(Python3Parser.Atom_exprContext ctx) {
        this.lockBranchCounter--;

    }

    public Node processAtomExpr(Python3Parser.Atom_exprContext ctx, Node parent, Node assignNode){ // assignNode is only used if there is a value to be assigned to this node
        this.lockBranchCounter++;
        Pair from = new Pair<Integer,Integer>(ctx.atom().start.getLine(), ctx.atom().start.getCharPositionInLine());
        Pair to = new Pair<Integer,Integer>(ctx.atom().stop.getLine(), ctx.atom().stop.getCharPositionInLine());
        if(!ctx.atom().getTokens(Python3Parser.NAME).isEmpty()){

            Var node = new Var(parent, from, to, ctx.atom().NAME().getText()); // assumes it is a var if not found
            if(assignNode != null){
                ((Var)node).setValue(assignNode);
            }

            if(!ctx.trailer().isEmpty()) {
                for (Python3Parser.TrailerContext trailer : ctx.trailer()) {
                    if (!trailer.getTokens(Python3Parser.OPEN_BRACK).isEmpty()) { // comprenhension
                        processSubscript(trailer.subscriptlist(), node);
                    } else if(!trailer.getTokens(Python3Parser.OPEN_PAREN).isEmpty()) { // function call
                        //pending

                    } else if(!trailer.getTokens(Python3Parser.DOT).isEmpty()) { // method or var from class/module
                        // pending
                    }
                }

            }
            parent.addChild(node);
            this.currentScope.addNodeToScope(node);
            return node;
        } else if(ctx.atom().testlist_comp() != null) {
            return processTestlist_comp(ctx.atom().testlist_comp(), parent);
        } else {
            Node node = new Node(parent, from, to); // simple node, does not go deeper
            node.type = (ctx.atom().NUMBER() !=null) ? "number" : (!ctx.atom().STRING().isEmpty()) ? "string"
                    : (ctx.atom().TRUE() != null || ctx.atom().FALSE() != null)? "boolean" : "node";
            parent.addChild(node);
            return node;
        }
    }

    @Override
    public void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
        this.lockBranchCounter--; // decrease subscript count
    }

    public Node processSubscript(Python3Parser.SubscriptlistContext ctx, Node parent) {
        this.lockBranchCounter++; // augment susbscript count

        //walk down to find closest atom_expr on tree
        ParseTreeWalker walker = new ParseTreeWalker();
        NextAtomExpr sb = new NextAtomExpr();
        walker.walk(sb, ctx);

        // Create subscript node
        Subscript subscript = new Subscript(
            parent,
            new Pair<Integer, Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine()),
            new Pair<Integer, Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine())
        );

        for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs){
            processAtomExpr(atom_expr_ctx, subscript, null);
        }
        parent.addChild(subscript);
        return subscript;
    }

    @Override
    public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        this.lockBranchCounter--;//augment testlist count
    }
    public Node processTestlist_comp(Python3Parser.Testlist_compContext ctx, Node parent) {
        this.lockBranchCounter++;//augment testlist count
        ParseTreeWalker walker = new ParseTreeWalker();
        NextAtomExpr sb = new NextAtomExpr();
        walker.walk(sb,ctx);

        List_ list = new List_(
            parent,
            new Pair<Integer, Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine()),
            new Pair<Integer, Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine())
        );

        for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs){
            processAtomExpr(atom_expr_ctx, list, null);
        }
        parent.addChild(list);
        return list;
    }


    // Pendientes
    @Override
    public void enterClassdef(Python3Parser.ClassdefContext ctx){
        String name = ctx.NAME().getText();
        Pair from = new Pair<Integer,Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Pair to = new Pair<Integer, Integer>(ctx.stop.getLine(), ctx.start.getCharPositionInLine());

        /*//scope change
        Scope scope = new Scope(this.currentScope);
        this.currentScope.addChild(scope);
        this.currentScope = scope;*/

        //Class _class = new Class();
    }
}
