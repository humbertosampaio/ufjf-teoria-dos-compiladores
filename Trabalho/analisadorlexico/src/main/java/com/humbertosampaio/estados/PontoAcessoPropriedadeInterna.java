package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class PontoAcessoPropriedadeInterna implements Estado {

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
