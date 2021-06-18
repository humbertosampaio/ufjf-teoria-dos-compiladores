package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
public class Diferenca implements Estado {

    @Override
    public boolean ehFinal() {
        return true;
    }

    @Override
    public TipoToken getTipoToken() {
        return TipoToken.Diferenca;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}