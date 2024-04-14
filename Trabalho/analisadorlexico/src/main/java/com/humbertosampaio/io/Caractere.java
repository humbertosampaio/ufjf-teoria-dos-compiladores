package com.humbertosampaio.io;

/**
 * @author Humberto Sampaio - 201635012
 */
public class Caractere {

    public final char conteudo;
    public final Posicao posicao;

    public Caractere(char conteudo, Posicao posicao) {
        this.conteudo = conteudo;
        this.posicao = posicao.clonar();
    }

}