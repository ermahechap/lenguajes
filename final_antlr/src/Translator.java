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
        if (ctx.body() != null){
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
        }
    }

    public void enterProc(MiLenguajeParser.ProcContext ctx){
        if (ctx.Returns() != null){
//            System.out.println("end");
        }
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
        if(ctx.TK_SWAP() != null){
            String v1 = ctx.getChild(0).getText();
            String v2 = ctx.getChild(2).getText();
            System.out.println(v1 + "," + v2 + " = " + v2 + "," + v1);
        }
        if(ctx.assigns()!=null){
            String id = ctx.getChild(0).getText();
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
    public void enterVar(MiLenguajeParser.VarContext ctx){
        printTab();
        if(ctx.comma_params() != null){
            for(int i = 0; i <ctx.comma_params().ID().size() ;  i++){
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
                        System.out.println(id + " = " );
                    }
                }
            }
        }
        if(ctx.assign_expression() != null){
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
    public void enterExpression(MiLenguajeParser.ExpressionContext ctx){
        //System.out.println("here");
    }

    @Override
    public void enterSequential(MiLenguajeParser.SequentialContext ctx){
        if(ctx.If()!=null){
            System.out.println("if " + ctx.getChild(1).getText()+" : ") ;
        }else if(ctx.Fa() != null){
            //System.out.println("for ");
        }else if (ctx.Do() != null){
            System.out.println("do:");
        }
    }

    @Override
    public void exitSequential(MiLenguajeParser.SequentialContext ctx){
        if(ctx.Od() != null){
            System.out.println("while " + ctx.getChild(1).getText());
        }
    }

    @Override
    public void enterFor_expr(MiLenguajeParser.For_exprContext ctx){
        System.out.println();
        String id = ctx.expression().assign().getChild(0).getText();
        String from  = ctx.expression().assign().getChild(2).getText();
        String to = ctx.getChild(2).getText();

        System.out.println("for "+id + " in range(" + from +", " + to + "):");
    }

    @Override
    public void exitFor_expr(MiLenguajeParser.For_exprContext ctx){

    }
    @Override
    public void enterIf_inner(MiLenguajeParser.If_innerContext ctx){
        if(ctx.TK_SEPARA()!=null){
            if(! ctx.getChild(1).getText().equals("else"))
                System.out.println("elif "+ctx.getChild(1).getText() + " :");
            else
                System.out.println("else:");

        }
    }

    @Override
    public void enterBlock(MiLenguajeParser.BlockContext ctx){
        //block stuff tabbed
        tab--;
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


}
