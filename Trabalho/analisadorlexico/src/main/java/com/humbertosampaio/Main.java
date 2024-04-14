package com.humbertosampaio;

import java.io.IOException;
import java.util.ArrayList;
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
            ArrayList<Token> tokens = getTokens(args);
            printOutput(tokens);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static ArrayList<Token> getTokens(String[] args) throws IOException {
        CodigoFonte codigoFonte = new CodigoFonte(args);
        LeitorCodigoFonte leitorCodigoFonte = new LeitorCodigoFonte(codigoFonte);
        AnalisadorLexico analisadorLexico = new AnalisadorLexico(leitorCodigoFonte);

        ArrayList<Token> tokens = new ArrayList<Token>();
        try {
            Token token;
            do {
                token = analisadorLexico.proximoToken();
                tokens.add(token);
            } while (token.getTipo() != TipoToken.EndOfFile);
        } finally {
            leitorCodigoFonte.close();
        }
        return tokens;
    }

    private static void printOutput(ArrayList<Token> tokens) {
        Output output = new Output(tamanhoSecao, separador);
        System.out.println(output.getCabecalho());
        System.out.println(output.getSeparador());

        for (Token token : tokens)
            System.out.println(output.format(token));
    }
}