import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap; 

import beaver.Symbol;
import beaver.Parser;

import ast.*;
import parsers.*;
import visitors.*;
import langUtil.*;

public class MiniLang{
      public static void main(String[] args){
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        try{
            MiniLangLex input = new MiniLangLex(new FileReader(args[0]));
            MiniLangParser p = new MiniLangParser();
            Node result = (Node) p.parse(input);
            
            if(p.isGood()){
                //System.out.println("Parsado !");
                //InterpretVisitor iv = new InterpretVisitor();
                //GraphVisitor gv = new GraphVisitor();
                //result.accept(gv);
                //result.accept(iv);
                //gv.saveToFile("Tree.graphviz");

		TypeCheckVisitor v = new TypeCheckVisitor();
		result.accept(v);

		if(v.getNumErrors() != 0) {
		    System.out.println( " Erros ocorreram durante a análise semântica.\nAbortando");
		    v.printErrors();
		    System.exit(1);
		}
		TyEnv<LocalEnv<SType>> env = v.getEnv();

		result.accept(new JavaVisitor(args[0].substring(0, args[0].length()-4), env));
                
            }else{
                System.out.println( " Erros ocorreram durante o parser.\nAbortando");
            }
        }
        catch (IOException e){
            System.err.println("Failed to read expression: " + e.getMessage());
        }
        catch (beaver.Parser.Exception e){
            System.err.println("Invalid expression: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("Exceção: " + e.getMessage());
            e.printStackTrace();
        } 
     }
}
