package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
		InputStream inputStream = new FileInputStream("lorem.txt");
	    Reader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String linha = bufferedReader.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		
		bufferedReader.close();

	}
}
