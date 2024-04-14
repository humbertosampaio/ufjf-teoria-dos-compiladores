package com.humbertosampaio.io;

import com.humbertosampaio.tokens.Token;

/**
 * @author Humberto Sampaio - 201635012
 */
public class Output {

	private final int _tamanhoSecao;
	private final char _separador;

	public Output(int tamanhoSecao, char separador) {
		_tamanhoSecao = tamanhoSecao;
		_separador = separador;
	}

	public String getCabecalho() {
		return String.format("%-" + _tamanhoSecao + "s| %-" + _tamanhoSecao + "s", "Lexema", "Tipo de Token");
	}

	public String getSeparador() {
		return "-".repeat(_tamanhoSecao) + _separador + "-".repeat(_tamanhoSecao);
	}

	public String format(Token token) {
		return token.toFormattedString(_tamanhoSecao);
	}
}
