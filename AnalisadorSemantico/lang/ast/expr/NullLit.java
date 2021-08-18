/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.expr;

import lang.ast.NodeVisitor;

public class NullLit extends Expr {
   
   public NullLit(){}
   
   public void accept(NodeVisitor v){ v.visit(this); }
}
