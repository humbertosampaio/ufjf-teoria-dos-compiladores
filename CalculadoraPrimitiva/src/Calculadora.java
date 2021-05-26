import java.util.LinkedList;

public class Calculadora {

    public LinkedList<LinkedList<String>> getTokens(String arquivo) throws Exception {

        int tamanhoArquivo = arquivo.length();
        if (tamanhoArquivo == 0)
            throw new Exception("Arquivo vazio.");

        LinkedList<String> tokensComando = new LinkedList<>();
        LinkedList<LinkedList<String>> comandos = new LinkedList<>();

        char charAtual;
        StringBuilder tokenBuilder = new StringBuilder();
        TipoCaractere tipoCaractereAtual;

        // Primeiro caractere
        charAtual = arquivo.charAt(0);
        TipoCaractere tipoUltimoCaractere = GetTipoCaractere(charAtual);
        tokenBuilder.append(charAtual);

        for (int i = 1; i < tamanhoArquivo; i++) {
            charAtual = arquivo.charAt(i);
            tipoCaractereAtual = GetTipoCaractere(charAtual);

            if (tipoCaractereAtual == TipoCaractere.Invalido)
                throw new Exception("Caractere inválido encontado: " + charAtual);

            // Espaço
            if (tipoCaractereAtual == TipoCaractere.Espaco) {
                if (tokenBuilder.length() > 0) {
                    tokensComando.add(tokenBuilder.toString());
                    tokenBuilder.setLength(0);
                }

                tipoUltimoCaractere = tipoCaractereAtual;
                continue;
            }

            // Final de comando
            if (tipoCaractereAtual == TipoCaractere.PontoVirgula) {
                if (tokenBuilder.length() > 0) {
                    tokensComando.add(tokenBuilder.toString());
                    tokenBuilder.setLength(0);
                }

                comandos.add(tokensComando);
                tokensComando = new LinkedList<>();

                tipoUltimoCaractere = tipoCaractereAtual;
                continue;
            }

            // Tokens diferentes sem espaço entre si
            if (tipoCaractereAtual != tipoUltimoCaractere
                && tipoUltimoCaractere != TipoCaractere.Espaco
                && tipoUltimoCaractere != TipoCaractere.PontoVirgula) {

                tokensComando.add(tokenBuilder.toString());
                tokenBuilder.setLength(0);

                tokenBuilder.append(charAtual);

                tipoUltimoCaractere = tipoCaractereAtual;
                continue;
            }

            tokenBuilder.append(charAtual);
            tipoUltimoCaractere = tipoCaractereAtual;
        }

        return comandos;
    }

    private TipoCaractere GetTipoCaractere(char c) {
        if (c == '=')
            return TipoCaractere.Igual;
        if (c == ';')
            return TipoCaractere.PontoVirgula;
        if (c == '+')
            return TipoCaractere.OperadorSoma;
        if (c == '*')
            return TipoCaractere.OperadorMultiplicacao;
        if (Character.isWhitespace(c))
            return TipoCaractere.Espaco;
        if (Character.isDigit(c))
            return TipoCaractere.Numero;
        if (Character.isLowerCase(c))
            return TipoCaractere.Letra;

        return TipoCaractere.Invalido;
    }
}