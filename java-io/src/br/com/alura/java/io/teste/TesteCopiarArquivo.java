package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new FileInputStream("lorem.txt");
		Reader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);

		OutputStream outputStream = new FileOutputStream("lorem2.txt");
		Writer writer = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		String linha = bufferedReader.readLine();

		while (linha != null && !linha.isEmpty()) {
			bufferedWriter.write(linha);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			linha = bufferedReader.readLine();
		}

		bufferedReader.close();
		bufferedWriter.close();
	}
}
