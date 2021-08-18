/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.cmd;

import lang.ast.NodeVisitor;
import lang.ast.expr.Expr;

public class Print extends Cmd { 
    private Expr e;
    
    public Print(Expr e){
        this.e = e;
    }
    
    public Expr getExpr(){ return e;}
    
    public void accept(NodeVisitor v){ v.visit(this);}
}
