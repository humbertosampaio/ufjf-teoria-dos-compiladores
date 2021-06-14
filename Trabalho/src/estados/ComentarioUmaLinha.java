package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício
 */
public class ComentarioUmaLinha implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
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
        if (c == '\n' || c == '\0')
            return null;

        return Estados.ComentarioUmaLinha;
    }

}
