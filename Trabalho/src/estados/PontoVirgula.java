package estados;

import tokens.TipoToken;

public class PontoVirgula implements Estado {

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
        return TipoToken.PontoVirgula;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}