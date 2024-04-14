package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class ContraBarra implements Estado {

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