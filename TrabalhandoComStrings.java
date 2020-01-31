package br.com.javalang;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		String nome = "Gabriel Sales";
		// nome = nome.replace("Sales", "David");
		nome = nome.toLowerCase();
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		System.out.println(nome.charAt(5));
		
		//for(int i = 0; i < nome.length(); i++) {
		//	System.out.println(nome.charAt(i));
		//}
		
		for(int i = (nome.length() - 1); i >= 0; i--) {
			System.out.println(nome.charAt(i));
		}
	}

}
