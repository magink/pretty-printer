package com.github.magink.pretty_printer;

import com.github.magink.parser.Document;
import com.github.magink.parser.Exclamation;
import com.github.magink.parser.Parser;
import com.github.magink.parser.Question;
import com.github.magink.parser.Sentence;
import com.github.magink.parser.Sentences;
import com.github.magink.parser.Statement;

public class PrettyPrinter {
  public final String RED = "\u001B[31m";
  public final String GREEN = "\u001B[32m";
  public final String CYAN = "\u001B[36m";
  public final String RESET = "\u001B[0m";

  public  final String BLACK_BOLD = "\033[1;30m";  // BLACK
  // Declaring ANSI_RESET so that we can reset the color
  public  final String ANSI_RESET = "\u001B[0m";
  // Declaring the background color
  public  final String ANSI_RED_BACKGROUND
      = "\u001B[41m";

  Parser parser;;
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
    printConsole(RED + toPrint + RESET);
    // String format = "%lineIndex"
  }
  private void printStatement(String toPrint) {
    printConsole(GREEN + toPrint + RESET);
  }
  private void printExclamation(String toPrint) {
    printConsole(CYAN + toPrint + RESET);
  }
  private void printConsole(String print) {
    System.out.println(print + RESET);
  }
}
