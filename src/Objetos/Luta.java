package Objetos;

import java.util.Random;

public class Luta {

	// atributos - tipo abstrato de dados
		private Lutador desafiado; // instâncias de uma outra classe - relacionamento de agregação
		private Lutador desafiante; // relacionamento de agregação
		private int rounds;
		private boolean aprovada;
		
		// métodos públicos
		// marcando a luta
		public void marcarLuta(Lutador l1, Lutador l2) {
			if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)) { // é o método da classe Lutador. Posso utilizar os métodos desse lutador ao chamar o objeto
				aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
			} else {
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;
			}
		}
		
		// momento da luta propriamente dito
		public void lutar() {
			if (this.aprovada) {
				System.out.println("### DESAFIADO ###");
				desafiado.apresentar();
				System.out.println("### DESAFIANTE ###");
				desafiante.apresentar();
				
				// criando um obj do tipo random
				Random aleatorio = new Random();
				int vencedor = aleatorio.nextInt(3); // vai gerar 3 resultados: 0 1 2 
				System.out.println("===== RESULTADO DA LUTA =====");
				
				switch(vencedor) {
				
					case 0: // empate
						System.out.println("Empatou");
						this.desafiado.empatarLuta();
						this.desafiante.empatarLuta();
						break;
					case 1: // desafiado vence
						System.out.println("Vitória do " + this.desafiado.getNome());
						this.desafiado.ganharLuta();
						this.desafiante.perderLuta();
						break;

					case 2: // desafiante vence
						System.out.println("Vitória do " + this.desafiante.getNome());
						this.desafiante.ganharLuta();
						this.desafiado.perderLuta();
						break;
				} 
				System.out.println("=============================");
				
			} else {
				System.out.println("A luta não pode acontecer!");
			}
		}
		// métodos especiais retornam um tipo abstrato de dado

		public Lutador getDesafiado() {
			return desafiado;
		}

		public void setDesafiado(Lutador desafiado) {
			this.desafiado = desafiado;
		}

		public Lutador getDesafiante() {
			return desafiante;
		}

		public void setDesafiante(Lutador desafiante) {
			this.desafiante = desafiante;
		}

		public int getRounds() {
			return rounds;
		}

		public void setRounds(int rounds) {
			this.rounds = rounds;
		}

		public boolean isAprovada() {
			return aprovada;
		}

		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}
}
