import tokens.Token;

public class Main {

    public static void main(String[] args) throws Exception {

        String caminhoArquivoFonte = System.getProperty("user.dir") + "\\input\\codigo-fonte.txt";
        LeitorCodigoFonte leitorCodigoFonte = new LeitorCodigoFonte(caminhoArquivoFonte);
        AnalisadorLexico analisadorLexico = new AnalisadorLexico(leitorCodigoFonte);

        Token token;
        try {
            while ((token = analisadorLexico.proximoToken()) != null) {
                System.out.println(token);
            }
        } finally {
            leitorCodigoFonte.close();
        }
    }

}