package com.github.magink.pretty_printer;

import com.github.magink.parser.Document;
import com.github.magink.parser.Exclamation;
import com.github.magink.parser.Parser;
import com.github.magink.parser.Question;
import com.github.magink.parser.Sentence;
import com.github.magink.parser.Sentences;
import com.github.magink.parser.Statement;

public class PrettyPrinter {

  Parser parser;

  public PrettyPrinter(Parser parser) {
    this.parser = parser;
  }

  public void print(){
    Document document = parser.parse();
    Sentences sentences = document.getSentences();
    int index = 1;
    for(Sentence s: sentences){
      if(s.getEndType().equals(Question.TYPE)) {
        printQuestion(index + ". " + s.toString());
      } else if(s.getEndType().equals(Statement.TYPE)) {
        printStatement(index + ". " + s.toString());
      } else if(s.getEndType().equals(Exclamation.TYPE)) {
        printExclamation(index + ". " + s.toString());
      }
      index++;
    }
  }
  private void printQuestion(String toPrint) {
    printConsole(Colors.RED_UNDERLINED + toPrint);
  }
  private void printStatement(String toPrint) {
    printConsole(Colors.GREEN + toPrint);
  }
  private void printExclamation(String toPrint) {
    printConsole(Colors.CYAN_BOLD + toPrint);
  }
  private void printConsole(String print) {
    System.out.println(print + Colors.RESET);
  }
}
