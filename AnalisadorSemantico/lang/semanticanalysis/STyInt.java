/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */


package lang.semanticanalysis;

public class STyInt extends SType {
    private static STyInt st = newSTyInt();

    private STyInt(){

    }

    public static STyInt newSTyInt(){
        return st;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyInt);
    }

    public String toString(){
        return "Int";
    }
}