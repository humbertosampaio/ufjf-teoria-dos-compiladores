package com.humbertosampaio;

import com.humbertosampaio.io.*;
import com.humbertosampaio.tokens.*;

/**
 * @author Humberto Sampaio - 201635012
 */
public class Main {

    static final int tamanhoSecao = 15;
    static final char separador = '|';

    public static void main(String[] args) {
        try {
            CodigoFonte codigoFonte = new CodigoFonte(args);
            LeitorCodigoFonte leitorCodigoFonte = new LeitorCodigoFonte(codigoFonte);
            AnalisadorLexico analisadorLexico = new AnalisadorLexico(leitorCodigoFonte);

            Token token;
            try {
                token = analisadorLexico.proximoToken();

                Output output = new Output(tamanhoSecao, separador);
                if (token.getTipo() != TipoToken.EndOfFile) {
                    System.out.println(output.getCabecalho());
                    System.out.println(output.getSeparador());
                }

                while (token.getTipo() != TipoToken.EndOfFile) {
                    System.out.println(output.format(token));
                    token = analisadorLexico.proximoToken();
                }
            } finally {
                leitorCodigoFonte.close();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}