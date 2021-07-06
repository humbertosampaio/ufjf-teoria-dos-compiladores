package lang.parser;

import lang.ast.SuperNode;
import lang.ast.Node;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

//Baseado no exemplo visto em aula

public class langParseAdaptor implements ParseAdaptor  {
   @Override
   public SuperNode parseFile(String path){

    try {
        //Cria um CharStream do ANTLR a partir de um arquivo, cujo caminho está em path
       CharStream stream = CharStreams.fromFileName(path);

       //Cria um lexer que alimenta stream
       langLexer lex = new langLexer(stream);

       //Cria um buffer de tokens pegos do lexer
       CommonTokenStream tokens = new CommonTokenStream(lex);

       //Cria o parser
       langParser parser = new langParser(tokens);
       
       ParseTree tree = parser.prog();

       if (parser.getNumberOfSyntaxErrors() != 0){
           return null;
       }

   }
    catch (Exception e) {
        e.printStackTrace();
    }
   
    
    return new Node();
}
}



