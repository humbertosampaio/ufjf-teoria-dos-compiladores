package estados;

import tokens.TipoToken;

public class Skip implements Estado {

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
        return null;
    }

}
