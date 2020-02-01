import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Translate {
    public static void main(String[] args) throws Exception {
        MiLenguajeLexer lexer;
        if(args.length > 0)
            lexer = new MiLenguajeLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new MiLenguajeLexer(CharStreams.fromStream(System.in));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiLenguajeParser parser = new MiLenguajeParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Translator(), tree);
        System.out.println();
    }
}
