/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.types;

import lang.ast.NodeVisitor;

public class TyArr extends SType {
    
    private SType arg;
    
    public TyArr(SType t){ arg = t; }
    
    public SType getTyArg(){ return arg;}
    
    public void accept(NodeVisitor v){ v.visit(this); }
    
}
