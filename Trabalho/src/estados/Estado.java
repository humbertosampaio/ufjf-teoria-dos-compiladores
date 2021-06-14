package estados;

import tokens.TipoToken;

public interface Estado {

    boolean ehFinal();

    boolean deveSerPulado();

    TipoToken getTipoToken();

    Estado proximoEstado(char c);

}