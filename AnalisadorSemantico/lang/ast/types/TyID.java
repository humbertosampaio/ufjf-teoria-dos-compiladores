/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.types;

import lang.ast.NodeVisitor;

public class TyID extends SType {
    
    private String name;
    public TyID(String name){ this.name = name; }
    
    public String getTyID(){ return name;}
    
    public void accept(NodeVisitor v){ v.visit(this); }
    
}
