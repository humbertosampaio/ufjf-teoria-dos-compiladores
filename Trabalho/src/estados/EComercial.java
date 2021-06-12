package estados;

import tokens.TipoToken;

public class EComercial implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return null;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '&') {
            return Estados.Conjuncao;
        }

        return null;
    }

}