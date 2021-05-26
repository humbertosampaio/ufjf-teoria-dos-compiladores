import java.util.List;

public class Comando {

    private List<Token> _tokens;

    public Comando(List<Token> tokens) {
        _tokens = tokens;
    }

    public boolean ehAtribuicao() {
        return _tokens.get(0).ehVariavel() && _tokens.size() > 2 && _tokens.get(1).ehSinalDeIgual();
    }

    public Comando getExpressao() {
        if (this.ehAtribuicao())
            return new Comando(_tokens.subList(2, _tokens.size()));

        return this;
    }

    public Token getTokenAtribuicao() {
        return _tokens.get(0);
    }

    public int getSize() {
        return _tokens.size();
    }

    public Token getToken(int indice) {
        return _tokens.get(indice);
    }

    public boolean contemOperacaoAposIndice(int indiceOperador) {
        return indiceOperador < getSize() - 2;
    }
}