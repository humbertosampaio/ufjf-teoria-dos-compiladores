package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class AbreChave implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
    }

    @Override
    public TipoToken getTipoToken() {
        return TipoToken.AbreChave;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '-')
            return Estados.ComentarioMultiplasLinhas;

        return null;
    }

}