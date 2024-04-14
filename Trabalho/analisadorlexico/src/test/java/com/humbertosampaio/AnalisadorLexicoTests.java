package com.humbertosampaio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.humbertosampaio.io.CodigoFonte;
import com.humbertosampaio.io.LeitorCodigoFonte;
import com.humbertosampaio.tokens.Token;
import com.humbertosampaio.tokens.TokenNaoReconhecido;

/**
 * @author Humberto Sampaio - 201635012
 */
public class AnalisadorLexicoTests {

	private static final String pathBase = "src/test/java/com/humbertosampaio/";
	private LeitorCodigoFonte _leitor;

	@ParameterizedTest
	@MethodSource("arquivosValidos")
	public void quando_ArquivoValido_Deve_ReconhecerTodosTokens(String pathArquivoValido) throws IOException {
		CodigoFonte codigoFonte = new CodigoFonte(pathBase + pathArquivoValido);
		_leitor = new LeitorCodigoFonte(codigoFonte);
		AnalisadorLexico sut = new AnalisadorLexico(_leitor);

		List<Token> tokens = sut.todosTokens();

		Assertions.assertTrue(tokens.stream().noneMatch(token -> token instanceof TokenNaoReconhecido));
	}

	@ParameterizedTest
	@MethodSource("arquivosInvalidos")
	public void quando_ArquivoInvalido_Deve_NaoReconhecerTokenInvalido(String pathArquivoInvalido)
			throws IOException {
		CodigoFonte codigoFonte = new CodigoFonte(pathBase + pathArquivoInvalido);
		_leitor = new LeitorCodigoFonte(codigoFonte);
		AnalisadorLexico sut = new AnalisadorLexico(_leitor);

		List<Token> tokens = sut.todosTokens();

		Assertions.assertTrue(tokens.stream().anyMatch(token -> token instanceof TokenNaoReconhecido));
	}

	@AfterEach
	void dispose() throws IOException {
		_leitor.close();
	}

	static Stream<String> arquivosValidos() {
		return getAllFiles("certo");
	}

	static Stream<String> arquivosInvalidos() {
		return getAllFiles("errado");
	}

	static Stream<String> getAllFiles(String relativePath) {
		File folder = new File(pathBase + relativePath);
		List<File> fileList = Arrays.asList(folder.listFiles());
		return fileList.stream().map(f -> relativePath + "/" + f.getName());
	}
}
