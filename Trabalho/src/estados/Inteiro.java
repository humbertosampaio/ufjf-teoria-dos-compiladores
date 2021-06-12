package estados;

import tokens.TipoToken;

public class Inteiro implements Estado {

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
        return TipoToken.Inteiro;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c >= '0' && c <= '9') {
            return Estados.Inteiro;
        }

        if (c == '.') {
            return Estados.Ponto;
        }

        return null;
    }

}