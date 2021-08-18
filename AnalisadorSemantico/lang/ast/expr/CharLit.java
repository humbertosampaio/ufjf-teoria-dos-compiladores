/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

import lang.ast.NodeVisitor;

public class CharLit extends Expr {
   
   private char val; 
   
   public CharLit(char b ){
       this.val = b;
   }
   
   public char getValue(){ return val;}
   
   public void accept(NodeVisitor v){ v.visit(this);}
}
