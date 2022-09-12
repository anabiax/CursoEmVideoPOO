package TestesParteTres;

import ObjetoParteTres.Ave;
import ObjetoParteTres.Cachorro;
import ObjetoParteTres.Canguru;
import ObjetoParteTres.Lobo;
import ObjetoParteTres.Mamifero;
import ObjetoParteTres.Peixe;
import ObjetoParteTres.Reptil;
import ObjetoParteTres.Tartaruga;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();
		m1.emitirSom();
		m1.setPeso(85.3f);
		m1.setIdade(15);
		m1.alimentar();
		m1.setMembros(4);
		m1.locomover();
		
		Reptil r1 = new Reptil();
		r1.alimentar();
		
		Peixe p1 = new Peixe();
		p1.emitirSom();
		p1.alimentar();
		p1.locomover();
		p1.setCorEscama("lilás");
		p1.soltarBolhas();
		
		Ave a1 = new Ave();
		a1.emitirSom();
		a1.alimentar();
		a1.locomover();
		a1.fazerNinho();
		
		Canguru c1= new Canguru();
		c1.locomover();
		c1.usarBolsa();
		
		Cachorro c2 = new Cachorro();
		c2.setCorPelo("caramelo");
		c2.abanarRabo();
		c2.enterrarOsso();
		c2.locomover();
		c2.emitirSom();
		
		Tartaruga t1 = new Tartaruga();
		t1.locomover();
		
		Lobo l1 = new Lobo();
		l1.emitirSom();
	}

}
