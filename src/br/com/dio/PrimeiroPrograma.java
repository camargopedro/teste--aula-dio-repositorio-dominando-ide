package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		// testando comiit push para o github
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 3;
		int b = 5;
		System.out.println("Hello World! " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}