/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */


package lang.semanticanalysis;

/*
    Classe para variáveis do tipo data, que podem ser criadas pelo usuário
*/
public abstract class STyData extends SType {
    private static STyData st = newSTyData();

    private STyData(){

    }

    public static STyData newSTyData(){
        return st;
    }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyData);
    }

    public String toString(){
        return "Int";
    }
}