package estados;

import tokens.TipoToken;

public class Subtracao implements Estado {

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
        return TipoToken.Subtracao;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '-')
            return Estados.ComentarioUmaLinha;

        return null;
    }

}