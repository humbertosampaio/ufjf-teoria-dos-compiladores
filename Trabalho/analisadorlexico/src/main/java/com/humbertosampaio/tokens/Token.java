package com.humbertosampaio.tokens;

/**
 * @author Humberto Sampaio - 201635012
 */
public class Token {

    protected final String _lexema;
    protected final TipoToken _tipo;

    public Token(String lexema, TipoToken tipoToken) {
        _lexema = lexema;
        _tipo = tipoToken;
    }

    public String getLexema() {
        return _lexema;
    }

    public TipoToken getTipo() {
        return _tipo;
    }

    @Override
    public String toString() {
        return _lexema;
    }

    public String toFormattedString(int qtdCaracteres) {
        return String.format("%-" + qtdCaracteres + "s| %-" + qtdCaracteres + "s", _lexema, _tipo);
    }
}