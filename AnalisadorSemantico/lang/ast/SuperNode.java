/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast;

public abstract class SuperNode extends beaver.Symbol {
   
   // The line and column of the node in the iput text
   //private int line, col;
   
   
   public abstract void accept(NodeVisitor v);
   
   public int getLine(){ return super.getLine(getStart());}
   public int getColumn(){ return super.getColumn(getStart());}
}


