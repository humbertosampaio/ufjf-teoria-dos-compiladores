package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class FechaChave implements Estado {

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
        return TipoToken.FechaChave;
    }

    @Override
    public Estado proximoEstado(char c) {
        return null;
    }

}