package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
class Subtracao implements Estado {

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

        if (c >= '0' && c <= '9')
            return Estados.NumeroInteiro;

        return null;
    }

}