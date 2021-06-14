package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class PontoFlutuante implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return TipoToken.PontoFlutuante;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c >= '0' && c <= '9') {
            return Estados.NumeroDecimal;
        }

        return null;
    }

}