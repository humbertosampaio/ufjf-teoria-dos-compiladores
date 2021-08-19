/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.semanticanalysis;
import java.util.HashMap;
import java.util.ArrayList;

public class TyEnv<T> {
    private HashMap<String, T> table;
    private ArrayList<T> funcs;

    public void set(String id, T ty){
        table.put(id, ty);
    }

    public T get(String id){
        return table.get(id);
    }

}
