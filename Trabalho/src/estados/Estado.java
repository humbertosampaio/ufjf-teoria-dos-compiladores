package estados;

import tokens.TipoToken;

public interface Estado {

    boolean ehFinal();

    TipoToken getTipoToken();

    boolean deveSerPulado();

    Estado proximoEstado(char c);

}