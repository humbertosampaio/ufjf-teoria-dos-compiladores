package com.humbertosampaio.io;

/**
 * @author Humberto Sampaio - 201635012
 */
public class Posicao {

    private int _linha, _coluna;

    public Posicao() {
        _linha = 1;
        _coluna = 0;
    }

    private Posicao(int linha, int coluna) {
        _linha = linha;
        _coluna = coluna;
    }

    public Posicao clonar() {
        return new Posicao(_linha, _coluna);
    }

    public int getLinha() {
        return _linha;
    }

    public int getColuna() {
        return _coluna;
    }

    public void incrementarLinha() {
        _linha++;
    }

    public void incrementarColuna() {
        _coluna++;
    }

    public void redefinirColuna() {
        _coluna = 0;
    }
}