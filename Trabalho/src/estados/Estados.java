package estados;

public final class Estados {

    // Estados finais
    public static Estado Identificador = new Identificador();
    public static Estado Tipo = new Tipo();
    public static Estado NumeroInteiro = new NumeroInteiro();
    public static Estado NumeroDecimal = new NumeroDecimal();
    public static Estado Caractere = new Caractere();
    public static Estado AbreChave = new AbreChave();
    public static Estado FechaChave = new FechaChave();
    public static Estado AbreColchete = new AbreColchete();
    public static Estado FechaColchete = new FechaColchete();
    public static Estado AbreParentese = new AbreParentese();
    public static Estado FechaParentese = new FechaParentese();
    public static Estado MenorQue = new MenorQue();
    public static Estado MaiorQue = new MaiorQue();
    public static Estado DoisPontos = new DoisPontos();
    public static Estado DoisPontosDuplo = new DoisPontosDuplo();
    public static Estado PontoVirgula = new PontoVirgula();
    public static Estado Virgula = new Virgula();
    public static Estado Atribuicao = new Atribuicao();
    public static Estado Igualdade = new Igualdade();
    public static Estado Negacao = new Negacao();
    public static Estado Diferenca = new Diferenca();
    public static Estado Conjuncao = new Conjuncao();
    public static Estado Soma = new Soma();
    public static Estado Subtracao = new Subtracao();
    public static Estado Multiplicacao = new Multiplicacao();
    public static Estado Divisao = new Divisao();
    public static Estado Resto = new Resto();

    // Estados intermediários
    public static Estado Inicial = new Inicial();
    public static Estado EComercial = new EComercial();
    public static Estado AspaSimples = new AspaSimples();
    public static Estado ContraBarra = new ContraBarra();
    public static Estado CaractereUmaAspaSimples = new CaractereUmaAspaSimples();
    public static Estado PontoFlutuante = new PontoFlutuante();
    public static Estado PontoAcessoPropriedadeInterna = new PontoAcessoPropriedadeInterna();

    // Estados a serem pulados
    public static Estado WhiteSpace = new WhiteSpace();
    public static Estado ComentarioUmaLinha = new ComentarioUmaLinha();
    public static Estado ComentarioMultiplasLinhas = new ComentarioMultiplasLinhas();
    public static Estado FechaComentarioMultiplasLinhasHifen = new FechaComentarioMultiplasLinhasHifen();
    public static Estado FechaComentarioMultiplasLinhasChave = new FechaComentarioMultiplasLinhasChave();

}