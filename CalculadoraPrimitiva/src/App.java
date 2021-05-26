import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        String caminhoArquivoEntrada = System.getProperty("user.dir") + "\\CalculadoraPrimitiva\\input\\programa.txt";
        ArquivoPrograma arquivoPrograma = new ArquivoPrograma();
        Calculadora calculadora = new Calculadora();

        try {
            String textoArquivo = arquivoPrograma.ler(caminhoArquivoEntrada);
            LinkedList<LinkedList<Token>> comandos = calculadora.getComandos(textoArquivo);
            calculadora.imprimirResultado(comandos);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}