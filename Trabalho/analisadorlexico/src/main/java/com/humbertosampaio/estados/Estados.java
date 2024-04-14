package com.humbertosampaio.estados;

/**
 * @author Humberto Sampaio - 201635012
 */
public final class Estados {

    // Estados finais
    public static final Estado Identificador = new Identificador();
    public static final Estado Tipo = new Tipo();
    public static final Estado NumeroInteiro = new NumeroInteiro();
    public static final Estado NumeroDecimal = new NumeroDecimal();
    public static final Estado Caractere = new Caractere();
    public static final Estado AbreChave = new AbreChave();
    public static final Estado FechaChave = new FechaChave();
    public static final Estado AbreColchete = new AbreColchete();
    public static final Estado FechaColchete = new FechaColchete();
    public static final Estado AbreParentese = new AbreParentese();
    public static final Estado FechaParentese = new FechaParentese();
    public static final Estado MenorQue = new MenorQue();
    public static final Estado MaiorQue = new MaiorQue();
    public static final Estado DoisPontos = new DoisPontos();
    public static final Estado DoisPontosDuplo = new DoisPontosDuplo();
    public static final Estado PontoVirgula = new PontoVirgula();
    public static final Estado Virgula = new Virgula();
    public static final Estado Atribuicao = new Atribuicao();
    public static final Estado Igualdade = new Igualdade();
    public static final Estado Negacao = new Negacao();
    public static final Estado Diferenca = new Diferenca();
    public static final Estado Conjuncao = new Conjuncao();
    public static final Estado Soma = new Soma();
    public static final Estado Subtracao = new Subtracao();
    public static final Estado Multiplicacao = new Multiplicacao();
    public static final Estado Divisao = new Divisao();
    public static final Estado Resto = new Resto();

    // Estados intermediários
    public static final Estado Inicial = new Inicial();
    public static final Estado EComercial = new EComercial();
    public static final Estado AspaSimples = new AspaSimples();
    public static final Estado ContraBarra = new ContraBarra();
    public static final Estado CaractereUmaAspaSimples = new CaractereUmaAspaSimples();
    public static final Estado PontoFlutuante = new PontoFlutuante();
    public static final Estado PontoAcessoPropriedadeInterna = new PontoAcessoPropriedadeInterna();

    // Estados a serem pulados
    public static final Estado WhiteSpace = new WhiteSpace();
    public static final Estado ComentarioUmaLinha = new ComentarioUmaLinha();
    public static final Estado ComentarioMultiplasLinhas = new ComentarioMultiplasLinhas();
    public static final Estado FechaComentarioMultiplasLinhasHifen = new FechaComentarioMultiplasLinhasHifen();
    public static final Estado FechaComentarioMultiplasLinhasChave = new FechaComentarioMultiplasLinhasChave();
}