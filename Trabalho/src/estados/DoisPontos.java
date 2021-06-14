package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício
 */
public class DoisPontos implements Estado {

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
        return TipoToken.DoisPontos;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == ':') {
            return Estados.DoisPontosDuplo;
        }

        return null;
    }

}