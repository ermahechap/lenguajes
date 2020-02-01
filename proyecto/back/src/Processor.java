import java.lang.ref.Reference;
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

// Main class for processing the tree
public class Processor extends Python3BaseListener {
    private Root root;
    public Scope currentScope; // namespaces - like a stack, but not a stack(because keeps references to its subscopes(aka. child scopes)) :v
    public Node currentNode; // not necessarly a scope (it could be an if, a for, etc....)

    public int lockBranchCounter = 0;

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx) {
        this.root = Root.getRootInstance();
        this.currentScope = new Scope(null, this.root);
        this.currentNode = this.root;
    }

    @Override
    public void exitFile_input(Python3Parser.File_inputContext ctx) {
        System.out.println("[");
        Node.nodeDump.forEach((n) -> System.out.println(n.toString() + ",")); // uses nodedump which is static
        System.out.println("]");
    }


    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        if(!ctx.getTokens(Python3Parser.ASSIGN).isEmpty()) { // variable assign
            int n_testlist_star = ctx.testlist_star_expr().size();
            Composed assignNode = null;
            for(int i = n_testlist_star - 1; i >=0; i--) {
                Python3Parser.Testlist_star_exprContext t_ctx = ctx.testlist_star_expr(i);
                Pair from = new Pair<>(t_ctx.start.getLine(), t_ctx.start.getCharPositionInLine());
                Pair to = new Pair<>(t_ctx.stop.getLine(), t_ctx.stop.getCharPositionInLine());


                if(i == n_testlist_star - 1 && n_testlist_star != 1){
                    assignNode = new Composed(this.currentNode, from, to);

                    for(Python3Parser.TestContext test_ctx : t_ctx.test()){
                        ComposedElement assignNodeElement = new ComposedElement(assignNode, from, to);

                        ParseTreeWalker walker = new ParseTreeWalker();
                        NextAtomExpr sb = new NextAtomExpr();
                        walker.walk(sb, test_ctx);
                        for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs) {
                            processAtomExpr(atom_expr_ctx, assignNodeElement, null);
                        }
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

    public ArrayList<Node> lookAhead(Python3Parser.TrailerContext ctx){ // null if trailer has no arglist, empty arraylist if no parameters
        if(ctx.OPEN_PAREN() == null) return null;
        ArrayList<Node> parameters = new ArrayList<>();

        if(ctx.arglist() == null) return parameters;
        for(Python3Parser.ArgumentContext arg_ctx : ctx.arglist().argument()){
            ParseTreeWalker walker = new ParseTreeWalker();
            NextAtomExpr sb = new NextAtomExpr();
            walker.walk(sb, (arg_ctx.test().size() > 1)? arg_ctx.test(1): arg_ctx.test(0) );
            sb.atom_expr_ctxs.forEach((a_ctx) -> parameters.add(processAtomExpr(a_ctx, this.currentNode, null)));
        }
        return parameters;
    }

    public Node processAtomExpr(Python3Parser.Atom_exprContext ctx, Node parent, Node assignNode){ // assignNode is only used if there is a value to be assigned to this node
        this.lockBranchCounter++;
        Pair from = new Pair<>(ctx.atom().start.getLine(), ctx.atom().start.getCharPositionInLine());
        Pair to = new Pair<>(ctx.atom().stop.getLine(), ctx.atom().stop.getCharPositionInLine());

        if(!ctx.atom().getTokens(Python3Parser.NAME).isEmpty()){

            if(ctx.trailer().isEmpty()){ // just var call (or function ref or class ref)
                Node referenced = this.currentScope.searchNode(ctx.atom().NAME().getText());
                if(referenced == null) return null;
                Node newNode = null;

                switch (referenced.type) {
                    case "variable": {
                        newNode = new Var(parent, from, to, ctx.atom().NAME().getText());
                        if(assignNode != null){
                            ((Var)newNode).setValue(assignNode);
                            this.currentScope.addNodeToScope( newNode ); // overwrites reference
                        }
                        break;
                    }
                    case "function": {
                        newNode = new FunctionReference(parent, from, to);
                        ((FunctionReference)newNode).calledFunction = referenced;
                        break;
                    }
                    case "class": {
                        newNode = new ClassCall(parent, from, to);
                        ((ClassCall)newNode).calledClass = referenced;
                    }
                    default: {
                        // check on defaults.. pending
                        break;
                    }
                }
                return newNode;

            }else {
                Composed composed = new Composed(parent, from, to);
                composed.finished = false;
                Scope lookupScope = this.currentScope;
                Node reference = lookupScope.searchNode(ctx.atom().NAME().getText());
                int lastIdx = -1;
                for(int i = -1 ; i < ctx.trailer().size(); i++) {
                    System.out.println("[");
                    Node.nodeDump.forEach((n) -> System.out.println(n.toString() + ",")); // uses nodedump which is static
                    System.out.println("]");
                    Pair t_from = new Pair<>((i==-1)? ctx.atom().start.getLine(): ctx.trailer(i).start.getLine(),(i==-1)? ctx.atom().start.getCharPositionInLine(): ctx.trailer(i).start.getCharPositionInLine());
                    Pair t_to = new Pair<>((i==-1)? ctx.atom().stop.getLine(): ctx.trailer(i).stop.getLine(),(i==-1)? ctx.atom().stop.getCharPositionInLine(): ctx.trailer(i).stop.getCharPositionInLine());
                    System.out.println(i);
                    System.out.println(lookupScope);
                    if(i >= 0) System.out.println(ctx.trailer(i).getText());
                    if(i >= 0)reference = lookupScope.searchNode(ctx.trailer(i).NAME().getText());

                    if(reference.type.equals("class")) {
                        ArrayList<Node> parameters = (i+1 < ctx.trailer().size()) ? lookAhead(ctx.trailer(i+1)) : null;
                        if(parameters == null){
                            ClassReference class_reference = new ClassReference(this.currentNode, t_from, t_to);
                            class_reference.setCalledClass(reference);
                            composed.addChild(class_reference);
                        } else {
                            ClassCall class_call = new ClassCall(this.currentNode, t_from, t_to);
                            parameters.forEach((x)->class_call.addParameter(x));
                            class_call.setCalledClass(reference);
                            composed.addChild(class_call);
                            i++;
                        }
                        lookupScope = reference.getScope();
                    } else if(reference.type.equals("function")) {
                        ArrayList<Node> parameters = (i+1 < ctx.trailer().size()) ? lookAhead(ctx.trailer(i+1)) : null;
                        if(parameters == null) {
                            FunctionReference function_ref = new FunctionReference(this.currentNode, t_from, t_to);
                            function_ref.setCalledFunction(reference);
                            composed.addChild(function_ref);
                        } else {
                            FunctionCall function_call = new FunctionCall(this.currentNode, t_from, t_to);
                            parameters.forEach((x)->function_call.addParameter(x));
                            function_call.setCalledFunction(reference);
                            composed.addChild(function_call);
                            composed.finished = true;
                        }
                    } else if(reference.type.equals("variable")){
                        Var var = (Var)reference;
                        if(var.value.type.equals("composed")) {
                            Composed found_composed = (Composed) var.value;
                            if (found_composed.finished) {
                                ComposedReference composed_ref = new ComposedReference(this.currentNode, t_from, t_to);
                                composed_ref.setReference(found_composed);
                                composed.addChild(composed_ref);
                                composed.finished = true;
                            } else {
                                Node last_child_composed = found_composed.children.get(found_composed.children.size() - 1);
                                if (last_child_composed.type.equals("class_reference")) {
                                    reference = ((ClassReference) last_child_composed).calledClass;
                                    lookupScope = reference.getScope();
                                } else if (last_child_composed.type.equals("class_call")) {
                                    reference = ((ClassCall) last_child_composed).calledClass;
                                    lookupScope = reference.getScope();

                                } else if (last_child_composed.type.equals("function_reference"))
                                    reference = ((FunctionReference) last_child_composed).calledFunction;
                                else composed.finished = true;
                                i--;
                            }
                        } else if(var.value.type.equals("class_call") ){
                            reference = ((ClassCall) var.value).calledClass;
                            lookupScope = reference.getScope();
                            i--;
                        } else if(var.value.type.equals("class_reference") ){
                            reference = ((ClassReference) var.value).calledClass;
                            lookupScope = reference.getScope();
                            i--;
                        } else if(var.value.type.equals("function_reference") ){
                            reference = ((FunctionReference) var.value).calledFunction;
                            i--;
                        } else {
                            VarReference var_ref = new VarReference(this.currentNode, from, to);
                            var_ref.setReference(reference);
                            composed.addChild(var_ref);
                            composed.finished = true;
                        }
                    } else {
                        composed.finished = true;
                    }
                    if(composed.finished){
                        lastIdx = i+1;
                        break;
                    }
                }

                // from here on it does not matter what reference is, nevertheless we keep indexing functions and slices that come from our local scope
                for(int i = lastIdx; i < ctx.trailer().size();i++){
                    Pair t_from = new Pair<>((i==-1)? ctx.atom().start.getLine(): ctx.trailer(i).start.getLine(),(i==-1)? ctx.atom().start.getCharPositionInLine(): ctx.trailer(i).start.getCharPositionInLine());
                    Pair t_to = new Pair<>((i==-1)? ctx.atom().stop.getLine(): ctx.trailer(i).stop.getLine(),(i==-1)? ctx.atom().stop.getCharPositionInLine(): ctx.trailer(i).stop.getCharPositionInLine());

                    if(ctx.trailer(i).subscriptlist() != null)
                        processSubscript(ctx.trailer(i).subscriptlist(), composed);
                    else if(ctx.trailer(i).arglist() != null)
                        lookAhead(ctx.trailer(i));
                }

                return composed;
            }
        } else if(ctx.atom().testlist_comp() != null) {
            return processTestlist_comp(ctx.atom().testlist_comp(), parent, (ctx.atom().OPEN_BRACK() != null));
        } else if(ctx.atom().dictorsetmaker() !=null) {
            return processDictorsetmaker(ctx.atom().dictorsetmaker(), parent);
        } else {
            Node node = new Node(parent, from, to); // simple node, does not go deeper
            node.type = (ctx.atom().NUMBER() !=null) ? "number" : (!ctx.atom().STRING().isEmpty()) ? "string"
                    : (ctx.atom().TRUE() != null || ctx.atom().FALSE() != null)? "boolean" : "node";
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
        return subscript;
    }

    /* LISTS */

    @Override
    public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        this.lockBranchCounter--;//augment testlist count
    }
    public Node processTestlist_comp(Python3Parser.Testlist_compContext ctx, Node parent, boolean isList) {
        this.lockBranchCounter++;//augment testlist count
        Pair from = new Pair<Integer, Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Pair to = new Pair<Integer, Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine());

        List_ list = (isList) ? new List_(parent, from, to) : new Tuple(parent, from, to); // handles tuples

        for(Python3Parser.TestContext t_ctx : ctx.test()){
            ParseTreeWalker walker = new ParseTreeWalker();
            NextAtomExpr sb = new NextAtomExpr();
            walker.walk(sb,t_ctx);

            ComposedElement composed_element = new ComposedElement(
                list,
                new Pair<Integer, Integer> (t_ctx.start.getLine(), t_ctx.start.getCharPositionInLine()),
                new Pair<Integer, Integer> (t_ctx.stop.getLine(), t_ctx.stop.getCharPositionInLine())
            );
            for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs) {
                processAtomExpr(atom_expr_ctx, composed_element, null);
            }
            list.addElement(composed_element);
        }

        return list;
    }

    /* DICTIONARIES */

    @Override
    public void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
        this.lockBranchCounter--;
    }

    public Node processDictorsetmaker(Python3Parser.DictorsetmakerContext ctx, Node parent){
        this.lockBranchCounter++;
        Pair from = new Pair<>(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Pair to = new Pair<>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine());

        Dictionary dictionary = new Dictionary(parent, from, to);

        int n_tests = ctx.test().size();
        for(int i = 0 ; i < n_tests; i+=2){
            Python3Parser.TestContext t_ctx01 = ctx.test(i), t_ctx02 = ctx.test(i+1);

            ComposedElement key = new ComposedElement(
                dictionary,
                new Pair<> (t_ctx01.start.getLine(), t_ctx01.start.getCharPositionInLine()),
                new Pair<> (t_ctx01.stop.getLine(), t_ctx01.stop.getCharPositionInLine())
            ), value = new ComposedElement(
                dictionary,
                new Pair<> (t_ctx02.start.getLine(), t_ctx02.start.getCharPositionInLine()),
                new Pair<> (t_ctx02.stop.getLine(), t_ctx02.stop.getCharPositionInLine())
            );

            ParseTreeWalker walker = new ParseTreeWalker();
            NextAtomExpr sb = new NextAtomExpr();
            walker.walk(sb,t_ctx01);

            for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs){
                processAtomExpr(atom_expr_ctx, key, null);
            }

            sb = new NextAtomExpr();
            walker.walk(sb,t_ctx02);

            for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs){
                processAtomExpr(atom_expr_ctx, value, null);
            }

            dictionary.addPairs(key,value);
        }

        return dictionary;
    }

    /* ---- FUNCTIONS ---- */
    @Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx){
        Pair from = new Pair<Integer,Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Pair to = new Pair<Integer,Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine());
        Function function = new Function(this.currentNode, from, to, ctx.NAME().getText());
        this.currentScope.addNodeToScope(function);

        Scope newScope = new Scope(this.currentScope, function);

        if(this.currentNode.type.equals("class") && function.name.equals("__init__"))
            ((Class)this.currentNode).setConstructor(function);

        if(ctx.parameters().typedargslist() != null) {
            for(Python3Parser.TfpdefContext t_ctx : ctx.parameters().typedargslist().tfpdef()) {
                Var var = new Var(
                    function,
                    new Pair<Integer, Integer>(t_ctx.start.getLine(), t_ctx.start.getCharPositionInLine()),
                    new Pair<Integer, Integer>(t_ctx.stop.getLine(), t_ctx.stop.getCharPositionInLine()),
                    t_ctx.NAME().getText()
                );
                function.addParameter(var);
                newScope.addNodeToScope(var);
            }
            for(Python3Parser.TestContext test_ctx: ctx.parameters().typedargslist().test()) {
                ParseTreeWalker walker = new ParseTreeWalker();
                NextAtomExpr sb = new NextAtomExpr();
                walker.walk(sb, test_ctx);

                Composed composed = new Composed(
                    this.currentNode,
                    new Pair<Integer, Integer>(test_ctx.start.getLine(), test_ctx.start.getCharPositionInLine()),
                    new Pair<Integer, Integer>(test_ctx.start.getLine(), test_ctx.start.getCharPositionInLine())
                );

                for(Python3Parser.Atom_exprContext atom_exprContext : sb.atom_expr_ctxs){
                    processAtomExpr(atom_exprContext, composed, null);
                }
            }
        }

        this.currentNode =  function;
        this.currentScope.addChild(newScope);
        this.currentScope = newScope;
        function.setScope(this.currentScope);
    }

    @Override
    public void exitFuncdef(Python3Parser.FuncdefContext ctx){
        this.currentScope = this.currentScope.getParentScope();
        this.currentNode = this.currentScope.getScopeNode();
    }

    @Override
    public void enterReturn_stmt(Python3Parser.Return_stmtContext ctx) {
        if(this.currentNode.type.equals("function") && ctx.testlist() != null){
            ReturnNode return_ = new ReturnNode(
                    this.currentNode,
                    new Pair<Integer, Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine()),
                    new Pair<Integer, Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine())
            );

            for(Python3Parser.TestContext test_ctx: ctx.testlist().test()){
                ParseTreeWalker walker = new ParseTreeWalker();
                NextAtomExpr sb = new NextAtomExpr();
                walker.walk(sb, test_ctx);

                ComposedElement composed_element = new ComposedElement(
                    return_,
                    new Pair<Integer, Integer>(test_ctx.start.getLine(), test_ctx.start.getCharPositionInLine()),
                    new Pair<Integer, Integer>(test_ctx.stop.getLine(), test_ctx.stop.getCharPositionInLine())
                );
                for(Python3Parser.Atom_exprContext atom_expr_ctx : sb.atom_expr_ctxs) {
                    processAtomExpr(atom_expr_ctx, composed_element, null);
                }
                return_.addReturn(composed_element);
            }
            ((Function)this.currentNode).addReturn(return_);
        }
    }


    /* ---- CLASS ---- */
    @Override
    public void enterClassdef(Python3Parser.ClassdefContext ctx) {
        Pair from = new Pair<Integer,Integer>(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Pair to = new Pair<Integer,Integer>(ctx.stop.getLine(), ctx.stop.getCharPositionInLine());

        Class class_ = new Class(this.currentNode, from, to, ctx.NAME().getText());
        if(ctx.arglist() != null) class_.setInherits((Class) this.currentScope.searchNode(ctx.arglist().getText()) );
        this.currentScope.addNodeToScope(class_);

        Scope newScope = new Scope(this.currentScope, class_);

        this.currentNode = class_;
        this.currentScope.addChild(newScope);
        this.currentScope = newScope;
        class_.setScope(this.currentScope);
    }

    @Override
    public void exitClassdef(Python3Parser.ClassdefContext ctx) {
        this.currentScope = this.currentScope.getParentScope();
        this.currentNode = this.currentScope.getScopeNode();
    }

    /* FOR */

}
