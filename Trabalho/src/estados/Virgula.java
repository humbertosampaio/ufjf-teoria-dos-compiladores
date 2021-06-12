package estados;

import tokens.TipoToken;

public class Virgula implements Estado {

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
        return TipoToken.Virgula;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}