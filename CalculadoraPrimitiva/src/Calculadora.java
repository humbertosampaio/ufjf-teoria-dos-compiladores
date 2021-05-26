import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Calculadora {

    private HashMap<String, Integer> _variaveis = new HashMap<>();

    public void imprimirResultado(LinkedList<LinkedList<Token>> comandos) throws Exception {

        for (LinkedList<Token> comando : comandos) {

            if (ehComandoDeAtribuicao(comando)) {
                int valorVariavel = calcularExpressao(comando.subList(2, comando.size()));
                _variaveis.put(comando.getFirst().getValor(), valorVariavel);
                continue;
            }

            int valorParaImpressao = calcularExpressao(comando);
            System.out.println(valorParaImpressao);
        }

    }

    private boolean ehComandoDeAtribuicao(LinkedList<Token> comando) {
        return comando.getFirst().ehVariavel() && comando.size() > 2 && comando.get(1).ehSinalDeIgual();
    }

    private int calcularExpressao(List<Token> expressao) throws Exception {

        Token tokenAtual, proximoTokenNumerico, primeiroTokenNumerico = expressao.get(0);
        int resultadoParcial = primeiroTokenNumerico.ehConstante()
            ? primeiroTokenNumerico.getValorInt()
            : _variaveis.get(primeiroTokenNumerico.getValor());
        int valorProximoTokenNumerico;
        Stack<Integer> pilhaSoma = new Stack<>();

        int tamanhoExpressao = expressao.size();
        for (int i = 1; i < tamanhoExpressao - 1; i += 2) { // iteração sobre os operadores
            tokenAtual = expressao.get(i);
            proximoTokenNumerico = expressao.get(i + 1);

            valorProximoTokenNumerico = proximoTokenNumerico.ehConstante()
                ? proximoTokenNumerico.getValorInt()
                : _variaveis.get(proximoTokenNumerico.getValor());

            if (tokenAtual.ehOperadorMultiplicacao()) {
                resultadoParcial *= valorProximoTokenNumerico;
                continue;
            }

            if (tokenAtual.ehOperadorSoma()) {

                if (!existeProximaExpressao(expressao, i)) {
                    resultadoParcial += valorProximoTokenNumerico;
                    continue;
                }

                Token proximoOperador = expressao.get(i + 2);
                if (proximoOperador.ehOperadorSoma()) {
                    resultadoParcial += valorProximoTokenNumerico;
                    continue;
                }

                if (proximoOperador.ehOperadorMultiplicacao()) {
                    pilhaSoma.add(resultadoParcial);
                    resultadoParcial = valorProximoTokenNumerico;
                    continue;
                }

                throw new Exception("Era esperado que o token '" + proximoOperador.getValor()
                        + "' fosse um operador de soma ou multiplicação.");
            }

            throw new Exception(
                    "Era esperado que este token fosse um sinal de soma ou multiplicação, mas foi encontrado '"
                            + tokenAtual.getValor());
        }

        for (Integer valor : pilhaSoma) {
            resultadoParcial += valor;
        }

        return resultadoParcial;
    }

    private boolean existeProximaExpressao(List<Token> expressao, int indiceOperadorAtual) {
        return indiceOperadorAtual < expressao.size() - 2;
    }

    public LinkedList<LinkedList<Token>> getComandos(String arquivo) throws Exception {

        int tamanhoArquivo = arquivo.length();
        if (tamanhoArquivo == 0)
            throw new Exception("Arquivo vazio.");

        LinkedList<Token> tokensComando = new LinkedList<>();
        LinkedList<LinkedList<Token>> comandos = new LinkedList<>();

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
                    tokensComando.add(new Token(tokenBuilder.toString()));
                    tokenBuilder.setLength(0);
                }

                tipoUltimoCaractere = tipoCaractereAtual;
                continue;
            }

            // Final de comando
            if (tipoCaractereAtual == TipoCaractere.PontoVirgula) {
                if (tokenBuilder.length() > 0) {
                    tokensComando.add(new Token(tokenBuilder.toString()));
                    tokenBuilder.setLength(0);
                }

                comandos.add(tokensComando);
                tokensComando = new LinkedList<>();

                tipoUltimoCaractere = tipoCaractereAtual;
                continue;
            }

            // Tokens diferentes sem espaço entre si
            if (tipoCaractereAtual != tipoUltimoCaractere && tipoUltimoCaractere != TipoCaractere.Espaco
                    && tipoUltimoCaractere != TipoCaractere.PontoVirgula) {

                tokensComando.add(new Token(tokenBuilder.toString()));
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