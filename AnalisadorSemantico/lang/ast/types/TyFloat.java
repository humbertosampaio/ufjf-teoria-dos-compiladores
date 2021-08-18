/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.types;

import lang.ast.NodeVisitor;

public class TyFloat extends SType {
    
    public void accept(NodeVisitor v){ v.visit(this);}
    
}
