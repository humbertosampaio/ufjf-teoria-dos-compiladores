package estados;

import tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
public class ContraBarra implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return null;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '\'' || c == '\\' || c == 'r' || c == 'b' || c == 't' || c == 'n') {
            return Estados.CaractereUmaAspaSimples;
        }

        return null;
    }

}