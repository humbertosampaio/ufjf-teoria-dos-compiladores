package com.humbertosampaio.estados;

import com.humbertosampaio.tokens.TipoToken;

/**
 * @author Humberto Sampaio - 201635012
 */
class Inicial implements Estado {

    @Override
    public boolean ehFinal() {
        return false;
    }

    @Override
    public boolean deveSerPulado() {
        return false;
    }

    @Override
    public TipoToken getTipoToken() {
        return null;
    }

    @Override
    public Estado proximoEstado(char c) {
        switch (c) {
            case '{':
                return Estados.AbreChave;
            case '}':
                return Estados.FechaChave;
            case '(':
                return Estados.AbreParentese;
            case ')':
                return Estados.FechaParentese;
            case '[':
                return Estados.AbreColchete;
            case ']':
                return Estados.FechaColchete;
            case '<':
                return Estados.MenorQue;
            case '>':
                return Estados.MaiorQue;
            case ':':
                return Estados.DoisPontos;
            case ';':
                return Estados.PontoVirgula;
            case '.':
                return Estados.PontoFlutuante;
            case ',':
                return Estados.Virgula;
            case '=':
                return Estados.Atribuicao;
            case '!':
                return Estados.Negacao;
            case '&':
                return Estados.EComercial;
            case '+':
                return Estados.Soma;
            case '-':
                return Estados.Subtracao;
            case '*':
                return Estados.Multiplicacao;
            case '/':
                return Estados.Divisao;
            case '%':
                return Estados.Resto;
            case '\'':
                return Estados.AspaSimples;
            case '\\':
                return Estados.ContraBarra;
        }

        if (Character.isDigit(c))
            return Estados.NumeroInteiro;
        if (Character.isUpperCase(c))
            return Estados.Tipo;
        if (Character.isLowerCase(c))
            return Estados.Identificador;
        if (Character.isWhitespace(c))
            return Estados.WhiteSpace;

        return null;
    }

}