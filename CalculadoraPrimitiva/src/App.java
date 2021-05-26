import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoArquivoEntrada =System.getProperty("user.dir") + "\\CalculadoraPrimitiva\\input\\programa.txt";
        ArquivoPrograma arquivoPrograma = new ArquivoPrograma();
        Calculadora calculadora = new Calculadora();

        String textoArquivo = arquivoPrograma.ler(caminhoArquivoEntrada);
        LinkedList<LinkedList<String>> tokens = calculadora.getTokens(textoArquivo);

        System.out.println(tokens);
    }
}
