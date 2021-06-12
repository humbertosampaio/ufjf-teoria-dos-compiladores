package tokens;

public class Token {

    private final String _lexema;
    private final TipoToken _tipo;

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
}