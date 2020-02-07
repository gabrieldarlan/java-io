package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Darlan");
//		cliente.setProfissao("Dev");
//		cliente.setProfissao("12312312");
//
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		objectOutputStream.writeObject(cliente);
//		objectOutputStream.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());

	}
}
