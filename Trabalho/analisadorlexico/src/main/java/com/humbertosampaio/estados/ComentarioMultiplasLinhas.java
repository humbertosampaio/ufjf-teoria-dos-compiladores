package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class ComentarioMultiplasLinhas implements Estado {

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
        return true;
    }

    @Override
    public Estado proximoEstado(char c) {
        if (c == '-')
            return Estados.FechaComentarioMultiplasLinhasHifen;

        return Estados.ComentarioMultiplasLinhas;
    }

}