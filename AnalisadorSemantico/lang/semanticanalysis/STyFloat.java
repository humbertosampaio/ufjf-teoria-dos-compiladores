/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyFloat extends SType {
    private static STyFloat st = newSTyFloat();

    private STyFloat(){

    }

    public static STyFloat newSTyFloat(){
        return st;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyFloat);
    }

    public String toString(){
        return "Float";
    }
}