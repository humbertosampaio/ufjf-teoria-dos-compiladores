/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.cmd;

import lang.ast.NodeVisitor;
import lang.ast.expr.Expr;

public class Return extends Cmd { 
    private Expr[] ex;
    
    public Return(Expr[] ex){
        this.ex = ex;
    }
    
    public Expr[] getExpr(){ return ex;}
    
    public void accept(NodeVisitor v){ v.visit(this);}
}
