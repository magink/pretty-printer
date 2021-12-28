
import com.github.magink.parser.Parser;
import com.github.magink.parser.TokenReceiver;
import com.github.magink.parser.TokenizerAdapter;
import com.github.magink.pretty_printer.PrettyPrinter;

public class App {
    public static void main(String[] args) throws Exception {
        String toTokenize = "I want to parse this string. Are you sure? YES I AM! ";
        TokenReceiver tokenAdapter = new TokenizerAdapter(toTokenize);
        Parser parser = new Parser(tokenAdapter);
        PrettyPrinter printer = new PrettyPrinter(parser);
        printer.print();
    }

}
