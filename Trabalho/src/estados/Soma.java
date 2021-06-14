package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class Soma implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return TipoToken.Soma;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}