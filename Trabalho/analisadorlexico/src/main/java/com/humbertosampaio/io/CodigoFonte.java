package com.humbertosampaio.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Humberto Sampaio - 201635012
 */
public class CodigoFonte {

	private static final String _nomeArquivoPadrao = "analisadorlexico/input/program.lan";
	private final File _arquivo;

	public CodigoFonte(String[] args) throws IOException {

		if (args.length > 0) {
			_arquivo = getArquivo(args[0]);
		} else {
			System.out.println(
					"Nenhum argumento encontrado. Você pode especificar o nome do arquivo como um argumento para a aplicação.");

			_arquivo = getArquivo(_nomeArquivoPadrao);
		}

		System.out.println("Analisando arquivo " + _arquivo.getCanonicalPath());
	}

	public CodigoFonte(String nomeArquivo) throws IOException {
		_arquivo = getArquivo(nomeArquivo);
	}

	private static File getArquivo(String nomeArquivo) throws IOException {
		File arquivo = new File(nomeArquivo);
		if (!arquivo.exists())
			throw new FileNotFoundException("Arquivo '" + arquivo.getCanonicalPath() + "' não encontrado.");

		return arquivo;
	}

	public File getArquivo() {
		return _arquivo;
	}
}
