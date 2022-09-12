package ObjetosParteUm;

public interface Controlador {

	// ATV DEMONSTRANDO A RIGIDEZ DO ENCAPSULAMENTO, protegendo as coisas internas

		// criada a interface
		public abstract void ligar();
		public abstract void desligar();
		public abstract void abrirMenu();
		public abstract void fecharMenu();
		public abstract void maisVolume();
		public abstract void menosVolume();
		public abstract void ligarMudo();
		public abstract void desligarMudo();
		public abstract void play();
		public abstract void pause();
}
