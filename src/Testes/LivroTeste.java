package Testes;

import Objetos.Livro;
import Objetos.Pessoa;

public class LivroTeste {

	public static void main(String[] args) {
		
		Pessoa [] pessoa = new Pessoa [2];
		Livro [] livro = new Livro [3];

		pessoa[0] = new Pessoa ("Ana", 21, "F");
		pessoa[1] = new Pessoa ("Rosangela", 51, "F");
		
		livro[0] = new Livro ("As Crônicas de Nárnia", "C.S. Lewis", 300, pessoa[0]);
		livro[1] = new Livro ("POO p/ iniciantes", "Pedro Paulo", 500, pessoa[1]);
		livro[2] = new Livro ("Java avançado", "Pedro Paulo", 800, pessoa[0]);

		livro[0].abrir();
		livro[0].folhear(350);
		System.out.println(livro[0].detalhes());
	}

}
