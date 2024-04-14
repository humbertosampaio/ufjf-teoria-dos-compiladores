package com.humbertosampaio.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Humberto Sampaio - 201635012
 */
public class CodigoFonte {

	private final File _arquivo;

	public CodigoFonte(String[] args) throws IOException {

		if (args.length == 0)
			throw new IllegalArgumentException(
					"Nenhum argumento encontrado. Você deve especificar o caminho absoluto do arquivo.");

		_arquivo = getArquivo(args[0]);
		System.out.println("Analisando arquivo " + _arquivo.getCanonicalPath());
	}

	public CodigoFonte(String nomeArquivo) throws IOException {
		_arquivo = getArquivo(nomeArquivo);
	}

	private static File getArquivo(String nomeArquivo) throws IOException {
		File arquivo = new File(nomeArquivo);

		if (!arquivo.isAbsolute())
			throw new IllegalArgumentException("O caminho do arquivo deve ser absoluto.");

		if (!arquivo.exists())
			throw new FileNotFoundException("Arquivo '" + arquivo.getCanonicalPath() + "' não encontrado.");

		return arquivo;
	}

	public File getArquivo() {
		return _arquivo;
	}
}
