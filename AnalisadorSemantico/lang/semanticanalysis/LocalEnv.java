/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;
import lang.semanticanalysis.*;

public class LocalEnv<T>{
    private String id;
    private SType st;

    public LocalEnv(String idF, SType t){
        id = idF;
        st = t;
    }

    public String getID(){
        return id;
    }

    public SType getFuncType(){
        return st;
    }

    public String toString(){
        return "";
    }
}