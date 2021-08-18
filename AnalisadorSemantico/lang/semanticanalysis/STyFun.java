/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;

public class STyFun extends SType {
    private SType ty[];

    public STyFun(SType t[]){
        ty = t;
    }

    public SType[] getTypes(){
        return ty;
    }

    public boolean match(SType v){
        boolean r = false;
        if (v instanceof STyFun){
            if ( ((STyFun)v).getTypes().length == ty.length){
                r = true;
                for (int i = 0; i < ty.length; i++){
                    r = r && ty[i].match(((STyFun)v).getTypes()[i]);
                }
            }
        }
        return r;
    }

    public String toString(){
        String s = "";
        if (ty.length > 0){
            s = ty[0].toString();
            for (int i = 0; i < ty.length; i++){
                s += "->" + ty[i].toString();
            }
        }
        return s;
    }
}