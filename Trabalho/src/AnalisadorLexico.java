import java.io.IOException;
import java.util.*;

import estados.*;
import tokens.*;
import util.*;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
public class AnalisadorLexico {

    private final LeitorCodigoFonte _leitorCodigoFonte;
    private final Stack<Estado> _pilhaEstados = new Stack<Estado>();

    public AnalisadorLexico(LeitorCodigoFonte leitorCodigoFonte) {
        _leitorCodigoFonte = leitorCodigoFonte;
    }

    /**
     * Retorna o próximo token válido do arquivo de entrada.
     *
     * @throws IOException Se algum erro de I/O ocorrer durante a leitura do
     *                     arquivo.
     */
    public Token proximoToken() throws IOException {

        if (_leitorCodigoFonte.chegouAoFimDoArquivo())
            return new Token(null, TipoToken.EndOfFile);

        StringBuilder lexema;
        do {
            _pilhaEstados.clear();
            lexema = executarAutomato();
        } while (_pilhaEstados.peek().deveSerPulado());

        /*
         * A seguir, faremos uma série de rollbacks procurando um estado final, mas se
         * não encontrarmos nenhum, devemos reportar o erro na posição atual.
         */
        Posicao posicaoAtual = _leitorCodigoFonte.getPosicao();

        /* Desempilhamos os estados até que encontremos um final, ou a pilha acabe. */
        Estado estado = _pilhaEstados.pop();
        while (!estado.ehFinal() && !_pilhaEstados.isEmpty()) {
            estado = _pilhaEstados.pop();
            _leitorCodigoFonte.rollback();
            lexema.setLength(lexema.length() - 1);
        }

        if (estado.ehFinal())
            return new Token(lexema.toString(), estado.getTipoToken());

        if (_leitorCodigoFonte.chegouAoFimDoArquivo())
            return new Token(null, TipoToken.EndOfFile);

        /*
         * Limpa-se a cache pois, se o conteúdo da cache não foi retornado no último
         * token, significa que é um caractere inválido. Logo, a leitura deve continuar
         * do próximo caractere do código-fonte.
         */
        _leitorCodigoFonte.limparCache();
        return new TokenNaoReconhecido(posicaoAtual);
    }

    /**
     * Avança nos estados do autômato, até que o mesmo não possua um estado de
     * destino.
     *
     * @return Um {@link StringBuilder} que contém o lexema lido até o último estado
     *         final do autômato.
     * @throws IOException Se ocorrer algum erro de I/O durante a leitura do arquivo
     *                     de entrada.
     */
    private StringBuilder executarAutomato() throws IOException {
        StringBuilder lexema = new StringBuilder();
        Estado estadoAtual = Estados.Inicial;
        char charAtual;

        /*
         * Lemos caracteres do arquivo e, enquanto estes caracteres levarem a estados
         * válidos, empilhamo-os a fim de rastrear o lexema referente ao último estado
         * final lido.
         */
        while (estadoAtual != null) {
            _pilhaEstados.push(estadoAtual);
            charAtual = _leitorCodigoFonte.proximoCaractere();
            lexema.append(charAtual);
            estadoAtual = estadoAtual.proximoEstado(charAtual);
        }

        /*
         * Ao lermos um caractere que leva a um estado inválido, "deslemos" o mesmo, uma
         * vez que ele não faz parte do lexema atual
         */
        _leitorCodigoFonte.rollback();
        lexema.setLength(lexema.length() - 1);
        return lexema;
    }

}