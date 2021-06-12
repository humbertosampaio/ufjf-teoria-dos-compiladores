package estados;

import tokens.TipoToken;

public class Negacao implements Estado {

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
        return TipoToken.Negacao;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '=') {
            return Estados.Negacao;
        }

        return null;
    }

}