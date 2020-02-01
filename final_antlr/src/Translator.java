import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Translator extends MiLenguajeBaseListener {

    public int tab = 0;
    public void printTab(){
        for (int i=0; i < tab ; i++) System.out.print("\t");
    }

    @Override
    public void enterResource(MiLenguajeParser.ResourceContext ctx){
        System.out.println("class " + ctx.ID().getText() + ":");

        tab++; printTab();
        System.out.print("def __init__(");
        if (ctx.TK_LEFT_PARENTHESES() != null){
            if (ctx.params() !=null){
                int len = ctx.params().param().size();
                for (int i = 0 ; i<len;i++){
                    System.out.print(ctx.params().param().get(i).ID().get(0).getText());
                    System.out.print(", ");
                }
            }
        }
        System.out.print("self");
        System.out.print("):");
        System.out.println();
        tab++;
    }

    @Override
    public void enterBody(MiLenguajeParser.BodyContext ctx){
        tab--;printTab(); System.out.print("def body(");
        if(ctx.params() != null){
            System.out.print(ctx.params().getText());
            int len = ctx.params().param().size();
            for (int i = 0 ; i<len;i++){
                System.out.print(ctx.params().param().get(i).ID().get(0).getText());
                System.out.print(", ");
            }
        }
        System.out.print("self");
        System.out.print("):");
        System.out.println();
        tab++;
    }

    @Override
    public void exitBody(MiLenguajeParser.BodyContext ctx){
        tab--;
    }
    @Override
    public void exitResource_body(MiLenguajeParser.Resource_bodyContext ctx){
        /*if (ctx.body() != null){
            // here we render the procs, by the end of the body
            if(ctx.body().resource_body().proc() != null) {
                int len = ctx.body().resource_body().proc().size();
                for (int i = 0 ; i < len ; i++){
                    String id = ctx.body().resource_body().proc().get(i).ID().getText();

                    System.out.print("def "+ id +"(");

                    if (ctx.body().resource_body().proc().get(i).param() != null){
                        int len_params = ctx.body().resource_body().proc().get(i).param().size();
                        if(ctx.body().resource_body().proc().get(i).Returns() != null) len_params--;
                        for (int j = 0 ; j < len_params; j++){
                            System.out.print(ctx.body().resource_body().proc().get(i).param().get(i).getText());
                        }
                    }

                    System.out.print("):");
                    System.out.println();
                }
            }
        }*/
    }

    public void enterProc(MiLenguajeParser.ProcContext ctx){
        printTab(); System.out.print("def " +  ctx.ID().getText() + "(");
        if(ctx.param() != null){
            System.out.print("temp_param");
        }
        System.out.print("):");
        System.out.println();
        tab++;
    }
    public void exitProc(MiLenguajeParser.ProcContext ctx){
        printTab();
        if (ctx.Returns() != null){
            System.out.println("return " + "sd"); //placeholder, change later
        }
        tab--;
    }

    @Override
    public void enterGlobal(MiLenguajeParser.GlobalContext ctx){
        for(ParseTree const_:ctx.const_()){
            System.out.println("global " + const_.getChild(1).getChild(0).getText());
        }
        tab++;
    }

    @Override
    public void exitGlobal(MiLenguajeParser.GlobalContext ctx){
        tab--;
    }

    @Override
    public void enterAssign(MiLenguajeParser.AssignContext ctx){
        printTab();
        if(ctx.TK_SWAP() != null){
            String v1 = ctx.getChild(0).getText();
            String v2 = ctx.getChild(2).getText();
            System.out.println(v1 + "," + v2 + " = " + v2 + "," + v1);
        }
        if(ctx.assigns()!=null){
            String id = ctx.assign_slice().get(0).getText();
            System.out.print(id + " ");
            String as = ctx.assigns().getChild(0).getText();
            switch (as){
                case "+:=":
                case "||:=":
                    System.out.print("+=");
                    break;
                case ":=":
                    System.out.print("=");
                    break;
                case "-:=":
                    System.out.print("-=");
                    break;
                case "*:=":
                    System.out.print("*=");
                    break;
                case "/:=":
                    System.out.print("/=");
                    break;
                case "%:=":
                    System.out.print("%=");
                    break;
                case "|:=":
                    System.out.print("|=");
                    break;
                case "&:=":
                    System.out.print("&=");
                    break;
                case "<<:=":
                    System.out.print("<<=");
                    break;
                case ">>:=":
                    System.out.print(">>=");
                    break;
            }
            System.out.println(" " + ctx.getChild(2).getText());
        }
    }

    @Override
    public void enterConst_(MiLenguajeParser.Const_Context ctx){
        printTab();
        if(ctx.assign_expression() !=null){
            System.out.print(ctx.assign_expression().getChild(0).getText() + " = ");
            System.out.print(ctx.assign_expression().getChild(2).getText());
        }else{
            System.out.print(ctx.equal_expression().getChild(0).getText() + " = ");
            System.out.print(ctx.equal_expression().getChild(2).getText());
        }
        System.out.println();
    }

    @Override
    public void enterVar_create(MiLenguajeParser.Var_createContext ctx){
        System.out.print(ctx.ID().get(0)+"= new "+ ctx.ID().get(1)+"(");
        if (ctx.comma_expressions_params()!=null) {
            int len = ctx.comma_expressions_params().ID().size();
            if (len != 0) {
                for (int i = 0; i < len; i++) {
                    System.out.print(ctx.comma_expressions_params().ID().get(i).getText());
                    if (i != len - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.print(")");
    }

    @Override
    public void enterVar(MiLenguajeParser.VarContext ctx){
        if(ctx.comma_params() != null){
            for(int i = 0; i <ctx.comma_params().ID().size() ;  i++){
                printTab();
                String id = ctx.comma_params().ID(i).getText();
                if (ctx.data_type() != null){
                    if(ctx.data_type().Chars() != null){
                        System.out.println(id + " = " + ctx.assign_expression().STRING().toString());

                    }
                    if(ctx.data_type().Char() != null){
                        System.out.println(id + " = " );
                    }
                    if(ctx.data_type().Bool() != null){
                        System.out.println(id + " = " );
                    }
                    if(ctx.data_type().Int() != null){
                        System.out.println(id + " = 0" );
                    }
                    if(ctx.data_type().Real() != null){
                        if(ctx.comma_params().subscript_slice() != null){
                            int tam =  ctx.comma_params().subscript_slice().size();
                            System.out.print(id + " = ");
                            for(int j = 1; j< tam - (tam -1)/2;j++){
                                System.out.print("[");
                            }
                            System.out.print("[0.0]");
                            for(int j = 0; j< tam - (tam -1)/2;j++){
                                String var =ctx.comma_params().getChild(1).getChild((2*j)+1).getText();
                                if(j+1 == tam - (tam -1)/2){
                                    System.out.print("*"+var);
                                }else {
                                    System.out.print("*"+var+"]");
                                }
                            }
                            System.out.println();
                            int t = ctx.comma_params().subscript_slice().size();
                        }else{
                            System.out.println(id + " =  0.0");
                        }
                    }
                    if(ctx.data_type().String() != null){
                        System.out.println(id + " = ''" );
                    }
                }
            }
        }
        if(ctx.assign_expression() != null){
            printTab();
            String id = ctx.assign_expression().getChild(0).getText();
            if(ctx.assign_expression().data_type() != null){
                if(ctx.assign_expression().data_type().Chars() != null){
                    System.out.println(id + " = " + ctx.assign_expression().STRING().toString());
                }
                if(ctx.assign_expression().data_type().Char() != null){
                    System.out.println(id + " = " );
                }
                if(ctx.assign_expression().data_type().Bool() != null){
                    System.out.println(id + " = " );
                }
                if(ctx.assign_expression().data_type().Int() != null){
                    System.out.println(id + " = " );
                }
                if(ctx.assign_expression().data_type().Real() != null){
                    System.out.println(id + " = 0.0");
                }
                if(ctx.assign_expression().data_type().String() != null){
                    System.out.println("String");
                }
            }
            if(ctx.assign_expression().binary_expression() != null){
                System.out.println(id + " = " + ctx.assign_expression().binary_expression().getText());
            }
        }
    }

    @Override
    public void enterSequential(MiLenguajeParser.SequentialContext ctx){

        if(ctx.If()!=null){
            printTab();
            System.out.println("if " + ctx.getChild(1).getText()+" : ") ;
            tab++;
        }else if (ctx.Do() != null){
            System.out.println("do:");
        }
        //fa is handled in another place
    }

    @Override
    public void exitSequential(MiLenguajeParser.SequentialContext ctx){
        if(ctx.Od() != null){
            printTab(); System.out.println("while " + ctx.getChild(1).getText());
        }
        tab--;
    }

    @Override
    public void enterFor_expr(MiLenguajeParser.For_exprContext ctx){
        String id = ctx.expression().assign().getChild(0).getText();
        String from  = ctx.expression().assign().getChild(2).getText();
        String to = ctx.getChild(2).getText();
        printTab();
        System.out.println("for "+id + " in range(" + from +", " + to + "):");
        tab++;
    }

    @Override
    public void exitFor_expr(MiLenguajeParser.For_exprContext ctx){
    }
    @Override
    public void enterIf_inner(MiLenguajeParser.If_innerContext ctx){
        printTab();
        if(ctx.TK_SEPARA()!=null){
            if(! ctx.getChild(1).getText().equals("else"))
                System.out.println("elif "+ctx.getChild(1).getText() + " :");
            else
                System.out.println("else:");

        }
        tab++;

    }
    @Override
    public void exitIf_inner(MiLenguajeParser.If_innerContext ctx){
    }

    @Override
    public void enterBlock(MiLenguajeParser.BlockContext ctx){
        //block stuff tabbed
        //tab--;
    }

    @Override
    public void exitBlock(MiLenguajeParser.BlockContext ctx){
    }

    @Override
    public void enterImport_ (MiLenguajeParser.Import_Context ctx){
        System.out.print("global " );
        int len = ctx.ID().size();
        for (int i = 0 ; i<len;i++){
            System.out.print(ctx.ID().get(i).getText());
            if(i < len-1) System.out.print(", ");
        }
        System.out.println();
    }

    @Override
    public void enterFunction_ (MiLenguajeParser.Function_Context ctx){
        printTab();
        if( ctx.RESERVED_WORD_F() != null ){
            if(ctx.RESERVED_WORD_F().getText().equals("write") || ctx.RESERVED_WORD_F().getText().equals("writes")){
                System.out.print("print"+ ctx.function_end().getText());
            }else if(ctx.RESERVED_WORD_F().getText().equals("write")){
                System.out.print("open"+ ctx.function_end().getText());
            }
        }else{
            System.out.print(ctx.getText());
        }
        System.out.println();
    }

}
