/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.ast.decls;

import lang.ast.SuperNode;
import lang.ast.cmd.*;
import lang.ast.types.*;
import lang.ast.expr.Expr;
import lang.ast.NodeVisitor;

public class Field extends SuperNode {
   
   private String id;
   private SType type;
   
   
   public Field(String id, SType t){
       this.id = id ;
       this.type = t;
   } 
   
   public SType getType(){return type;}
   public String getFieldId(){return id;}
   
   public void accept(NodeVisitor v){ v.visit(this);}
   
}

