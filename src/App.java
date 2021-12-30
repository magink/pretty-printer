
import com.github.magink.parser.Parser;
import com.github.magink.parser.TokenReceiver;
import com.github.magink.parser.TokenizerAdapter;
import com.github.magink.pretty_printer.PrettyPrinter;

public class App {
    public static void main(String[] args) throws Exception {
        String toTokenize = 
        "What is a contact microphone?" +  
        "A contact mic records sounds from inside things. Like this ice." +
        "Your mangled brain would like you to know that there is a boxer called Contact Mike" +
        "Yeah? Any news on my wife name? How about my mother?" + 
        "Nope. You are welcome!";
        TokenReceiver tokenAdapter = new TokenizerAdapter(toTokenize);
        Parser parser = new Parser(tokenAdapter);
        PrettyPrinter printer = new PrettyPrinter(parser);
        printer.print();
    }

}
