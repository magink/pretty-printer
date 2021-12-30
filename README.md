## Pretty Printer

A very simple java app that prettifies output from a parser. Types of sentences are distinguished with different colors. The output is written to console, and requires an ANSI compatible console application for color formatting to be visible.

## How to use

Add the parser library to the project using your build tools.
First give the tokenizer adapter (bundled in the parser jar) the string to tokenize, or create your own adapter against the TokenReceiver interface. For information can be found in the [parser project](https://github.com/magink/parser/blob/main/README.md)

- `String toTokenize = "I want to parse this string. Are you sure? YES I AM! ";`
- `TokenReceiver tokenAdapter = new TokenizerAdapter(toTokenize);`

Create a new parser object with the TokenAdapter.

- `Parser parser = new Parser(tokenAdapter);`

Create a new PrettyPrinter object and give it the parser.

- `PrettyPrinter printer = new PrettyPrinter(parser);`

Call `print()` method

- `printer.print();`

### Imporant

Not all console applications can handle ANSI characters. Most applications for Linux supports ANSI, but on Windows it can be more shaky. I have verified it works with native cmd on Windows 10 but not working with Git Bash. Please read this wikipedia article to see which console applications can support ANSI characters [](https://en.wikipedia.org/wiki/ANSI_escape_code#Platform_support)

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder where dependencies live, more specifically the parser jar file.

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
