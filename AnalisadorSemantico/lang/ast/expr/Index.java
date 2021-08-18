/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

import lang.ast.NodeVisitor;

public class Index extends Expr {
   
   private Expr idx;
   
   public Index(Expr i){
       this.idx = i; 
   }
   
   public Expr getIndex(){ return idx;}
   
   public void accept(NodeVisitor v){ v.visit(this);}
}
