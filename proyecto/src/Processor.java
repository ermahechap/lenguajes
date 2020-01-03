import org.antlr.v4.runtime.tree.ParseTree;

public class Processor extends Python3BaseListener {
    private Root root;
    public Node scope;
    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx){
        this.root = Root.getRootInstance();
        this.scope = root;
        System.out.println(this.root.show());
    }

    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        ParseTree instance = ctx.getChild(0);
        System.out.println(ctx.getToken(40,0));
        if (instance.getChildCount() <= 1){ // Just an assign
        }else{

        }
    }
}
