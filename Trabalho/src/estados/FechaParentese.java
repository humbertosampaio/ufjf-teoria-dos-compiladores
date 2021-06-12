package estados;

import tokens.TipoToken;

public class FechaParentese implements Estado {

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
        return TipoToken.FechaParentese;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}