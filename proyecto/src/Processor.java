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
    public Scope currentScope;
    public Stack<Integer> status = new Stack<Integer>();
    public int lockBranchCounter = 0;
    public String []globalScope = {
        "max", "len", "min", "str"
    };

    public static final int
        VAR_ASSIGN = 1, VAR_CALL = 2, COMPOUND = 3;

    public ArrayList<Node> toAssign = new ArrayList<>();
    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx){
        this.root = Root.getRootInstance();
        this.currentScope = new Scope(null, this.root);
        System.out.println(this.root.show());
    }

    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {

        if(!ctx.getTokens(Python3Parser.ASSIGN).isEmpty()) {
            this.status.push(VAR_ASSIGN);
        } else {
            this.status.push(VAR_CALL);
        }
    }

    @Override
    public void enterAtom_expr(Python3Parser.Atom_exprContext ctx) {
        if(this.lockBranchCounter > 0) return;
        processAtomExpr(ctx, this.currentScope.getScopeNode());

    }

    public void processAtomExpr(Python3Parser.Atom_exprContext ctx, Node parent){
        if(!ctx.atom().getTokens(Python3Parser.NAME).isEmpty()){
            Pair from = new Pair<Integer,Integer>(ctx.atom().start.getLine(), ctx.atom().start.getCharPositionInLine());
            Pair to = new Pair<Integer,Integer>(ctx.atom().stop.getLine(), ctx.atom().stop.getCharPositionInLine());

            Var var = new Var(parent, from, to, ctx.atom().NAME().getText());

            if(!ctx.trailer().isEmpty()) {
                for (Python3Parser.TrailerContext trailer : ctx.trailer()) {
                    //if(trailer.getTokens(Python3Parser.RULE_subscriptlist).isEmpty()) continue;
                    if (!trailer.getTokens(Python3Parser.OPEN_BRACK).isEmpty()) { // comprenhension
                        processSubscript(trailer.subscriptlist(), var);

                    } else if(!trailer.getTokens(Python3Parser.OPEN_PAREN).isEmpty()) { // function call
                        //pending
                    } else if(!trailer.getTokens(Python3Parser.DOT).isEmpty()) { // method or var from function
                        // pending
                    }
                }
            }
            parent.addChild(var);
            System.out.println(var.show());
        } else if(ctx.atom().testlist_comp() != null) {
            processTestlist_comp(ctx.atom().testlist_comp(), parent);
        }
    }

    @Override
    public void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
        this.lockBranchCounter--; // decrease subscript count
    }

    public void processSubscript(Python3Parser.SubscriptlistContext ctx, Node parent) {
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
            processAtomExpr(atom_expr_ctx, subscript);
        }
        parent.addChild(subscript);
        System.out.println(subscript.show());
    }

    @Override
    public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        this.lockBranchCounter--;//augment testlist count
    }
    public void processTestlist_comp(Python3Parser.Testlist_compContext ctx, Node parent) {
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
            processAtomExpr(atom_expr_ctx, list);
        }
        parent.addChild(list);
        System.out.println(list.show());
    }


    /*@Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx) {
        Function func = new Function(this.currentNode,
                new Pair<Integer,Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine()),
                new Pair<Integer,Integer>(ctx.stop.getLine(), ctx.start.getCharPositionInLine()),
                ctx.NAME().getText()
        );

        // set node parameters as nodes

        //create new scope
        Scope newScope = new Scope(this.currentScope, func);
        this.currentScope.addChild(newScope);
        this.currentScope = newScope;
    }

    @Override
    public void exitFuncdef(Python3Parser.FuncdefContext ctx){
        this.currentScope = this.currentScope.getParentScope();
    }*/


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
