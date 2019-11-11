import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            MiLenguajeLexer lexer;
            if (args.length>0)
                lexer = new MiLenguajeLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new MiLenguajeLexer(CharStreams.fromStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            ParseTree tree = parser.inicio();

            System.out.println(tree.toStringTree(parser));
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

