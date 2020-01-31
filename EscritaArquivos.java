package br.com.javalang;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
		PrintStream escrever = new PrintStream( new FileOutputStream("saida.txt", true));
		
		for(int i = 0; i < 5; i++) {
		
		System.out.println("Escreva alguma coisa: ");
		String msg = teclado.nextLine();
		
		escrever.println(msg);
		}
		escrever.close();
		
		} catch(FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo! ");
		}
		
		teclado.close();
	}

}
