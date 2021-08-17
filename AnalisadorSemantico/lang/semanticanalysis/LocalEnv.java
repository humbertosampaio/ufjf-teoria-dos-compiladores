package lang.semanticanalysis;

public class LocalEnv{
    private String id;
    private SType st;

    public LocalEnv(String idF, SType t){
        id = idF;
        st = t;
    }

    public getId(){
        return id;
    }

    public getSType(){
        return t;
    }

    public String toString(){
        return "";
    }
}