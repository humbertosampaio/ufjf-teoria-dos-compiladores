package com.humbertosampaio.io;

import java.io.*;
import java.util.*;

/**
 * @author Humberto Sampaio - 201635012
 */
public class LeitorCodigoFonte {

    /**
     * Um elemento é adicionado aqui sempre que fazemos um {@link #rollback()}. Ao
     * ler o próximo caractere, este campo tem precedência sobre o arquivo físico.
     */
    private final Stack<Character> _cache = new Stack<Character>();
    /**
     * Contém todos os caracteres lidos. Utilizado para preencher a {@link #_cache}
     * quando necessário.
     */
    private final Stack<Caractere> _caracteresLidos = new Stack<Caractere>();
    private final BufferedReader _reader;

    private boolean _fimDoArquivo = false;
    private Posicao _posicao = new Posicao();

    public LeitorCodigoFonte(CodigoFonte codigoFonte) throws IOException {
        _reader = new BufferedReader(new FileReader(codigoFonte.getArquivo()));
    }

    public Posicao getPosicao() {
        return _posicao;
    }

    public boolean chegouAoFimDoArquivo() {
        return _fimDoArquivo;
    }

    /**
     * Obtém o próximo caractere para leitura.
     *
     * @throws IOException Se algum erro de I/O ocorrer durante a leitura do
     *                     arquivo.
     */
    public char proximoCaractere() throws IOException {

        /*
         * Obtém o próximo caractere preferencialmente da cache. Se estiver vazia, busca
         * do arquivo físico.
         */
        char proximoChar = !_cache.isEmpty() ? _cache.pop() : lerDoArquivoFisico();

        /*
         * Enfileira o caractere e sua posição, para que possa ser recuperado quando o
         * analisador chegar a um Estado inválido.
         */
        Caractere caractere = new Caractere(proximoChar, _posicao);
        _caracteresLidos.push(caractere);

        return proximoChar;
    }

    private char lerDoArquivoFisico() throws IOException {
        int i = _reader.read();
        if (i == -1) {
            _fimDoArquivo = true;
            return '\0';
        }

        /* Atualiza a posição do leitor, para reportar o local dos erros. */
        char c = (char) i;
        if (c == '\n') {
            _posicao.redefinirColuna();
            _posicao.incrementarLinha();
        } else {
            _posicao.incrementarColuna();
        }

        return c;
    }

    /**
     * Marca o último caractere como não-lido, mas adiciona-o à cache em memória,
     * para que seja lido como parte do próximo token.
     */
    public void rollback() {
        Caractere ultimoCaractereLido = _caracteresLidos.pop();
        _cache.push(ultimoCaractereLido.conteudo);
    }

    /**
     * Limpa a cache para que o próximo caractere retornado por
     * {@link #proximoCaractere()} seja lido do arquivo físico.
     */
    public void limparCache() {
        _cache.clear();
    }

    /**
     * Fecha o arquivo de entrada.
     *
     * @throws IOException Se algum erro de I/O ocorrer durante o fechamento do
     *                     arquivo.
     */
    public void close() throws IOException {
        if (_reader != null) {
            _reader.close();
        }
    }

}