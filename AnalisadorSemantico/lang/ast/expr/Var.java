/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

import lang.ast.NodeVisitor;

public class Var extends Expr {
   
   private String val; 
   
   public Var(String n ){
       this.val = n;
   }
   
   public String getVarName(){ return val;}
   
   public void accept(NodeVisitor v){ v.visit(this);}
}
