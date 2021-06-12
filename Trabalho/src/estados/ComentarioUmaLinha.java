package estados;

import tokens.TipoToken;

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
        if (c == '\n')
            return null;

        return Estados.ComentarioUmaLinha;
    }

}
