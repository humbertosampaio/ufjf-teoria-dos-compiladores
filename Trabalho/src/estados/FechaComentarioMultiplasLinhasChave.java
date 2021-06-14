package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class FechaComentarioMultiplasLinhasChave implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
    }

    @Override
    public boolean deveSerPulado() {
        return true;
    }

    @Override
    public TipoToken getTipoToken() {
        return null;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }
}
