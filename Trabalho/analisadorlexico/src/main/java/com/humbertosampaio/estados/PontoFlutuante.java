package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class PontoFlutuante implements Estado {

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
        return TipoToken.PontoFlutuante;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c >= '0' && c <= '9') {
            return Estados.NumeroDecimal;
        }

        return null;
    }

}