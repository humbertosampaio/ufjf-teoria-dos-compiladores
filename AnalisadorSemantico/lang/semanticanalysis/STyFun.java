package lang.semanticanalysis;

public abstract class STyFun extends SType {
    private SType ty[];

    private STyFun(SType t[]){
        ty = t;
    }

    public static STyFun newSTyFun(){
        return st;
    }

    public boolean match(SType v){
        boolean r = false;
        if (v instanceof StyFun){
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