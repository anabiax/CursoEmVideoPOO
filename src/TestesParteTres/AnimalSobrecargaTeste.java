package TestesParteTres;

import ObjetoParteTres.CachorroSobrecarga;

public class AnimalSobrecargaTeste {

	public static void main(String[] args) {

/*	Mamifero m1 = new Mamifero();
	m1.emitirSom(); */
	
	CachorroSobrecarga c1 = new CachorroSobrecarga();
	c1.emitirSom();
	c1.reagir("Olá"); // abanar e latir
	c1.reagir("vai apanhar"); // rosnar
	c1.reagir(11, 45);  // abanar
	c1.reagir(21, 00);  // ignorar
	c1.reagir(true);  // abanar
	c1.reagir(false);  // rosnar e latir
	c1.reagir(2, 12.5); // latir
	c1.reagir(17, 4.5);  // rosnar
	
	}
}
