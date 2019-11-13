
public class Translator extends MiLenguajeBaseListener {

    public int tab_counter = 0;

    @Override
    public void enterResource(MiLenguajeParser.ResourceContext ctx){
        System.out.println("class " + ctx.ID().get(0 + ":");
        System.out.println(ctx.ID().get(0));
    }

    @Override
    public void enterResource_body(MiLenguajeParser.Resource_bodyContext ctx){
        tab_counter++;

    }

    @Override
    public void exitResource_body(MiLenguajeParser.Resource_bodyContext ctx){
        tab_counter--;

    }
    @Override
    public void enterVar(MiLenguajeParser.VarContext ctx){
        //System.out.println(ctx.comma_params());
    }

}
