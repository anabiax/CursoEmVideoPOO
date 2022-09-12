package Testes;

import ObjetosParteUm.Caneta;

public class CanetaTeste {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;// atributo
		c1.tampar(); // alternar para "destampada"

		c1.status(); // método
		c1.rabiscar();
																										
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "preta";
		c2.destampar();
		c2.rabiscar(); // comportamento difere, pois esta rabisca

		c2.status(); 
		c2.rabiscar();
	
	}

}
