/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyErr extends SType {
    private static STyErr st = newSTyErr();

    private STyErr(){

    }

    public static STyErr newSTyErr(){
        return st;
    }

    public boolean match(SType v){
        return true;
    }

    public String toString(){
        return "TyError";
    }
}