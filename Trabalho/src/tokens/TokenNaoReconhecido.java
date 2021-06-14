package tokens;

import util.Posicao;

/**
 * @author Humberto Sampaio
 * @author Luís Henrique Simplício
 */
public class TokenNaoReconhecido extends Token {

    private Posicao _posicao;

    public TokenNaoReconhecido() {
        super(null, TipoToken.NaoReconhecido);
    }

    public TokenNaoReconhecido(Posicao posicao) {
        super(null, TipoToken.NaoReconhecido);
        _posicao = posicao;
    }

    @Override
    public String toString() {
        return "ERRO: Token não reconhecido na linha "
            + _posicao.getLinha()
            + ", coluna "
            + _posicao.getColuna()
            + ".";
    }

    @Override
    public String toFormattedString(int qtdCaracteres) {
        return this.toString();
    }

}
