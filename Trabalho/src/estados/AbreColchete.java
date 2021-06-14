package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class AbreColchete implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
    }

    @Override
    public TipoToken getTipoToken() {
        return TipoToken.AbreColchete;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}