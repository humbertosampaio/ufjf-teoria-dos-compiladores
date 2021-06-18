import tokens.TipoToken;
import tokens.Token;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */
public class Main {

    public static void main(String[] args) throws Exception {

        String nomeArquivoFonte = getNomeArquivoFonte(args);
        String caminhoArquivoFonte = "../input/" + nomeArquivoFonte;
        LeitorCodigoFonte leitorCodigoFonte = new LeitorCodigoFonte(caminhoArquivoFonte);
        AnalisadorLexico analisadorLexico = new AnalisadorLexico(leitorCodigoFonte);

        Token token;
        int tamanhoSecao = 15;
        char separador = '|';
        try {
            token = analisadorLexico.proximoToken();
            if (token.getTipo() != TipoToken.EndOfFile) {
                System.out.println(String.format("%-" + tamanhoSecao + "s| %-" + tamanhoSecao + "s", "Token", "Tipo de Token"));
                System.out.println("-".repeat(tamanhoSecao) + separador + "-".repeat(tamanhoSecao));
            }

            while (token.getTipo() != TipoToken.EndOfFile) {
                System.out.println(token.toFormattedString(tamanhoSecao));
                token = analisadorLexico.proximoToken();
            }
        } finally {
            leitorCodigoFonte.close();
        }
    }

    private static String getNomeArquivoFonte(String[] args) {
        String nomeArquivoFonte;
        if (args.length == 0) {
            System.out.println("Uma vez que nenhum argumento foi encontrado, o analisador procurará o código-fonte"
                    + " no arquivo de nome 'codigo-fonte.txt', no diretório 'input'.");

            nomeArquivoFonte = "codigo-fonte.txt";
        } else {
            nomeArquivoFonte = args[0];
        }
        return nomeArquivoFonte;
    }

}