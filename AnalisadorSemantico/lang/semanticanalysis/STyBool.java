/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyBool extends SType {
    private static STyBool st = newSTyBool();

    private STyBool(){

    }

    public static STyBool newSTyBool(){
        return st;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyBool);
    }

    public String toString(){
        return "Bool";
    }
}