package estados;

import tokens.TipoToken;

public class PontoFlutuante implements Estado {

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
        return TipoToken.Float;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c >= '0' && c <= '9') {
            return Estados.PontoFlutuante;
        }

        return null;
    }

}