/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

import lang.ast.NodeVisitor;

public class Not extends Expr {
   
   private Expr e;
   
   public Not(Expr e){
       this.e = e;
   }
   
   public Expr getExpr(){return e;}
   public void accept(NodeVisitor v){ v.visit(this);}
}
