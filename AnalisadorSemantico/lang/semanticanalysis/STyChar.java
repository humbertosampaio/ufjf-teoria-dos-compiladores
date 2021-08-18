/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyChar extends SType {
    private static STyChar st = newSTyChar();

    private STyChar(){

    }

    public static STyChar newSTyChar(){
        return st;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyChar);
    }

    public String toString(){
        return "Char";
    }
}