package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream outputStream = new FileOutputStream("lorem2.txt");
		Writer writer = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		bufferedWriter.write("Mussum Ipsum, cacilds vidis litro abertis. Admodum ");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("accumsan disputationi eu sit. Vide electram sadipscing et per.");
	
		bufferedWriter.close();
	}
}
