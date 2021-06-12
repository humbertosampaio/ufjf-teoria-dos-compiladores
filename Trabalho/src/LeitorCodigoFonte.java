import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class LeitorCodigoFonte {

    private final LinkedList<Character> _cache = new LinkedList<>();
    private final Stack<Caractere> _caracteresLidos = new Stack<Caractere>();
    private final BufferedReader _reader;
    private Posicao _posicao = new Posicao();

    public Posicao getPosicao() {
        return _posicao;
    }


    public LeitorCodigoFonte(String caminhoArquivoEntrada) throws FileNotFoundException {
        _reader = new BufferedReader(new FileReader(new File(caminhoArquivoEntrada)));
    }

    public char proximoCaractere() throws IOException {

        char c;
        if (!_cache.isEmpty()) { // Prioriza o que está na cache
            c = _cache.poll();
        } else {
            int i = _reader.read();
            c = (i == -1) ? '\0' : (char) i;
        }

        if (c == '\n') {
            _posicao.redefinirColuna();
            _posicao.incrementarLinha();
        } else if (c != '\0') {
            _posicao.incrementarColuna();
        }

        Caractere caractere = new Caractere(c, _posicao.clonar());
        _caracteresLidos.push(caractere);

        return c;
    }

    public void rollback() {
        Caractere ultimoCaractereLido = _caracteresLidos.pop();
        _cache.add(0, ultimoCaractereLido.conteudo);
        _posicao = ultimoCaractereLido.posicao;
    }

    public void close() throws IOException {
        if (_reader != null) {
            _reader.close();
        }
    }

}