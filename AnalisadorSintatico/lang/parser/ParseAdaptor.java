package lang.parser;

import java.io.*;
import lang.ast.SuperNode;
import lang.ast.Node;
import lang.parser.*;
import java.util.List;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path);
   
}



