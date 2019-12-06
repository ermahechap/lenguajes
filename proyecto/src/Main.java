import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        try{
            Python3Lexer lexer;
            if(args.length > 0){
                lexer = new Python3Lexer(CharStreams.fromFileName(args[0]));
            }else{
                lexer = new Python3Lexer(CharStreams.fromStream(System.in));
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            ParseTree tree = parser.file_input();
            System.out.println(tree.toStringTree(parser));
        }catch (Exception e){
            System.err.println("Error(Test): " + e);
        }
    }
}
