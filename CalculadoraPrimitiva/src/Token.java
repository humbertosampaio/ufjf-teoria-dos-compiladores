public class Token {

    private String _valor;
    private TipoToken _tipoToken;

    public Token(String valor) throws Exception {
        _valor = valor;

        char c = valor.charAt(0);
        if (c == '+')
            _tipoToken = TipoToken.OperadorSoma;
        else if (c == '*')
            _tipoToken = TipoToken.OperadorMultiplicacao;
        else if (c == '=')
            _tipoToken = TipoToken.SinalDeIgual;
        else if (Character.isDigit(c))
            _tipoToken = TipoToken.Constante;
        else if (Character.isLowerCase(c))
            _tipoToken = TipoToken.Variavel;
        else
            throw new Exception("Token inválido: " + valor);
    }

    public boolean ehVariavel() {
        return _tipoToken == TipoToken.Variavel;
    }

    public boolean ehConstante() {
        return _tipoToken == TipoToken.Constante;
    }

    public boolean ehOperadorSoma() {
        return _tipoToken == TipoToken.OperadorSoma;
    }

    public boolean ehOperadorMultiplicacao() {
        return _tipoToken == TipoToken.OperadorMultiplicacao;
    }

    public boolean ehSinalDeIgual() {
        return _tipoToken == TipoToken.SinalDeIgual;
    }

    public String getValor() {
        return _valor;
    }

    public int getValorInt() {
        return Integer.parseInt(_valor);
    }

    @Override
    public String toString() {
        return _valor;
    }
}