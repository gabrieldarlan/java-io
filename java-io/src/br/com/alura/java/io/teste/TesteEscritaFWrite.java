package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFWrite {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("lorem3.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("Em pé sem cair, deitado sem dormir, sentado sem cochilar");
		
		bufferedWriter.close();
	}
}
