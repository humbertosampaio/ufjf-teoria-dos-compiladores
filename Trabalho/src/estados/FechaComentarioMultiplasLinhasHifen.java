package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
public class FechaComentarioMultiplasLinhasHifen implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
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
        if (c == '}')
            return Estados.FechaComentarioMultiplasLinhasChave;

        if (c == '-')
            return Estados.FechaComentarioMultiplasLinhasHifen;

        return Estados.ComentarioMultiplasLinhas;
    }

}