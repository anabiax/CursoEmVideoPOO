package Testes;

import Objetos.Luta;
import Objetos.Lutador;

public class LutadorTeste {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
				// vetor de 6 posi��es
		// cada um deles � um novo objeto de lutador
		
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1); // n� reais
		
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3); 
		
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1); 
		
		l[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f, 81.6f, 13, 0, 2); 
		
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4); 

		// l[3].status();
		
        // Ultra Emoji Combat
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[3], l[5]); // R: A luta n�o pode acontecer, dado que as categorias s�o diferentes!
		UEC01.lutar();
		// l[0].status();
		// l[1].status();
		
	}

}
