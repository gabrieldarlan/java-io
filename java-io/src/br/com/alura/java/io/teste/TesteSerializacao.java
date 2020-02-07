package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "Nome";
		
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		objectOutputStream.writeObject(nome);
//		objectOutputStream.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		
	}
}
