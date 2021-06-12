package estados;

import tokens.TipoToken;

public class MenorQue implements Estado {

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
        return TipoToken.MenorQue;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}