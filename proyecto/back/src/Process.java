import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Process {
    public static void main(String[] args) throws Exception {
        Python3Lexer lexer;
        if(args.length > 0){
            System.out.println("FILE MODE");
            lexer = new Python3Lexer(CharStreams.fromFileName(args[0]));
        }
        else{
            System.out.println("STREAM MODE");
            lexer = new Python3Lexer(CharStreams.fromStream(System.in));
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Python3Parser parser = new Python3Parser(tokens);

        ParseTree tree = (args.length > 0)? parser.file_input() : parser.eval_input();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Processor(), tree);
        System.out.println();
    }
}