package estados;

import tokens.TipoToken;

public class WhiteSpace implements Estado {

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
        if (Character.isWhitespace(c))
            return Estados.WhiteSpace;

        return null;
    }

}
