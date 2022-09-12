package Testes;

import ObjetosParteUm.ControleRemoto;

public class ControladorTeste {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		// métodos estão privados na outra aba, a alteração é feita pelos set
		c.ligar();
		c.maisVolume();
		c.play();
		// c.ligarMudo();
		c.abrirMenu();
		// c.fecharMenu();
	

	}

}
