import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class Processor extends Python3BaseListener {
    private Root root;
    public Node currentNode;
    public Scope currentScope;
    public int status = 0;

    public static final int
        VAR_ASSIGN = 1, VAR_CALL = 2;

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx){
        this.root = Root.getRootInstance();
        this.currentNode = root;
        this.currentScope = new Scope(null);
        System.out.println(this.root.show());
    }

    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        System.out.println("Enter<< " + ctx.getText());

        if(!ctx.getTokens(Python3Parser.ASSIGN).isEmpty()) {
            this.status = VAR_ASSIGN;
            ArrayList<ArrayList<String>> names = new ArrayList<>();
            if(ctx.getTokens(Python3Parser.ASSIGN).size() == 1) {
                ArrayList<String> n = new ArrayList<>();
                for(int i = 0; i < ctx.getChild(0).getChildCount(); i++) {
                    if(!ctx.getChild(0).getChild(i).getText().equals(","))
                        n.add(ctx.getChild(0).getChild(i).getText());
                }
                names.add(n);
            }else{
                int eqCount = ctx.getTokens(Python3Parser.ASSIGN).size();
                for (int j = 0; j < ctx.getChildCount(); j++){
                    if(ctx.getChild(j).getText().equals("=")) { eqCount--; continue; }
                    if(eqCount == 0) break;
                    ArrayList<String> n = new ArrayList<>();
                    for(int i = 0; i < ctx.getChild(j).getChildCount(); i++){
                        if(!ctx.getChild(j).getChild(i).getText().equals(","))
                            n.add(ctx.getChild(j).getChild(i).getText());
                    }
                    names.add(n);
                }
            }

            System.out.println(names);


        }else{ // only a call
            this.status = VAR_CALL;
        }
    }
}
