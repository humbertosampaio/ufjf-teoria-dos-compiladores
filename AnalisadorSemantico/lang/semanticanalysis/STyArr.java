/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyArr extends SType {
    private static SType a;

    private STyArr(SType t){
        a = t;
    }

    public SType getArg(){
        return a;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyArr) && (a.match( ((STyArr)v).getArg()));
    }

    public String toString(){
        return a.toString() + "[]";
    }
}