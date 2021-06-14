package estados;

import tokens.TipoToken;

public class PontoAcessoPropriedadeInterna implements Estado {

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
        return TipoToken.PontoAcessoPropriedadeInterna;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c >= 'a' && c <= 'z') {
            return Estados.Identificador;
        }

        return null;
    }


}
