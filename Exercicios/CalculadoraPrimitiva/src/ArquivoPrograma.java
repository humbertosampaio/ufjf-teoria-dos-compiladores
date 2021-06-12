import java.io.*;

public class ArquivoPrograma {

    public String ler(String caminhoArquivoEntrada) throws IOException {

        File arquivoEntrada = new File(caminhoArquivoEntrada);

        StringBuilder stringBuilder = new StringBuilder();
        String linha;
        BufferedReader reader = new BufferedReader(new FileReader(arquivoEntrada));

        try {
            while ((linha = reader.readLine()) != null) {
                stringBuilder.append(linha);
            }
        } finally {
            reader.close();
        }

        return stringBuilder.toString();
    }

}