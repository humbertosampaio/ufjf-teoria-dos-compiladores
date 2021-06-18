package estados;

import tokens.TipoToken;
/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
 
public interface Estado {

    boolean ehFinal();

    boolean deveSerPulado();

    TipoToken getTipoToken();

    Estado proximoEstado(char c);

}