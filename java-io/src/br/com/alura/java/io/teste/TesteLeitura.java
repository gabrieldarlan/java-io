package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		FileInputStream fileInputStream = new FileInputStream("lorem.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String linha = bufferedReader.readLine();
		
		System.out.println(linha);
		
		bufferedReader.close();
		
	}
}
