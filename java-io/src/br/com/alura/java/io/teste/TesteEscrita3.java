package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TesteEscrita3 {

	public static void main(String[] args) throws FileNotFoundException {
		
//		PrintStream printStream = new PrintStream("lorem2.txt");
		PrintStream printStream = new PrintStream(new File("lorem2.txt"));
		
		printStream.println("Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris");
		printStream.println("Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris");
		
		printStream.close();
		
	}
}
