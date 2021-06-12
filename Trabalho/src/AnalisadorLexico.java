import java.io.IOException;
import java.util.*;

import estados.*;
import tokens.Token;

public class AnalisadorLexico {

    private LeitorCodigoFonte _leitorCodigoFonte;

    public AnalisadorLexico(LeitorCodigoFonte leitorCodigoFonte) throws Exception {
        _leitorCodigoFonte = leitorCodigoFonte;
    }

    public Token proximoToken() throws Exception {

        Stack<Estado> pilhaEstados = new Stack<Estado>();
        String lexema;
        do {
            lexema = proximoLexema(pilhaEstados);
        } while (pilhaEstados.peek().deveSerPulado());

        Estado estado = pilhaEstados.pop();
        while (!estado.ehFinal() && !pilhaEstados.isEmpty()) {
            estado = pilhaEstados.pop();
            _leitorCodigoFonte.rollback();
        }

        if (estado.ehFinal())
            return new Token(lexema, estado.getTipoToken());

        if (lexema.isEmpty())
            return null;

        throw new Exception(
            "Token inesperado na linha "
            + _leitorCodigoFonte.getPosicao().getLinha()
            + ", coluna "
            + _leitorCodigoFonte.getPosicao().getColuna()
            + "."
        );
    }

    private String proximoLexema(Stack<Estado> pilhaEstados) throws IOException {
        StringBuilder lexema = new StringBuilder();
        Estado estadoAtual = Estados.Inicial;
        char charAtual;

        while (estadoAtual != null) {
            pilhaEstados.push(estadoAtual);
            charAtual = _leitorCodigoFonte.proximoCaractere();
            lexema.append(charAtual);
            estadoAtual = estadoAtual.proximoEstado(charAtual);
        }

        _leitorCodigoFonte.rollback();
        lexema.deleteCharAt(lexema.length() - 1);
        return lexema.toString();
    }

}