package Testes;

import Objetos.ContaBanco;

public class ContaBancoTeste {

	public static void main(String[] args) {
		
		ContaBanco b1 = new ContaBanco();
		b1.setNumConta(2222);
		b1.setDono("Fulana de Tal");
		b1.abrirConta("CC");
		b1.depositar(200); 
		b1.visualizar(); 
		b1.sacar(250);
		b1.fecharConta();

		ContaBanco b2 = new ContaBanco();
		b2.setNumConta(8888);
		b2.setDono("Ciclano de Tal");
		b2.abrirConta("CP"); // defino aqui se a conta estará aberta ou não
		b2.depositar(500); // R$ 650,00 até entao
		b2.sacar(1000); // R$ 550,00 
		b2.visualizar(); 

	}

}
