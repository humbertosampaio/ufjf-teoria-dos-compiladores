package estados;

import tokens.TipoToken;

public class FechaChave implements Estado {

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
        return TipoToken.FechaChave;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}