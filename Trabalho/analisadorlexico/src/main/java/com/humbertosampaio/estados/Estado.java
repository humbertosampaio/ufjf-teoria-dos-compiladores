package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */

public interface Estado {

    boolean ehFinal();

    boolean deveSerPulado();

    TipoToken getTipoToken();

    Estado proximoEstado(char c);

}