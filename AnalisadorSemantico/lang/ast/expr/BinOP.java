/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

public abstract class BinOP extends Expr {
   
   private Expr l,r;
   public BinOP(Expr left, Expr right ){
       l = left;
       r = right;
   }
   
   public Expr getLeft(){ return l;}
   public Expr getRight(){ return r;}

}
