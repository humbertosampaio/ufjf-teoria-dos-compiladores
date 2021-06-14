package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class ComentarioMultiplasLinhas implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return null;
    }

    @Override
    public boolean deveSerPulado() {
        return true;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '-')
            return Estados.FechaComentarioMultiplasLinhasHifen;

        return Estados.ComentarioMultiplasLinhas;
    }

}