package Testes;

import ObjetosParteUm.ControleRemoto;

public class ControladorTeste {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		// m�todos est�o privados na outra aba, a altera��o � feita pelos set
		c.ligar();
		c.maisVolume();
		c.play();
		// c.ligarMudo();
		c.abrirMenu();
		// c.fecharMenu();
	

	}

}
