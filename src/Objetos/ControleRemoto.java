package Objetos;

public class ControleRemoto implements Controlador {

	// ATV DEMONSTRANDO A RIGIDEZ DO ENCAPSULAMENTO, protegendo as coisas internas
	
	// atributos privados p/ proteger dos meios externos.
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// m�todos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// m�todos abstratos

	@Override // significa sobreescrever
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("------ MENU ------");
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		
		for(int i = 0; i <= this.getVolume(); i += 10) { // passar 10
			System.out.print(" | ");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.print("\n Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) { // n�o h� necessidade de colocar == true
			this.setVolume(this.getVolume() + 5); // aumenta de 5 em 5
		} else {
			System.out.println("Imposs�vel aumentar o volume");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) { // n�o h� necessidade de colocar == true
			this.setVolume(this.getVolume() -5 ); // diminui de 5 em 5
		} else {
			System.out.println("Imposs�vel diminuir o volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0); // mutei
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("N�o consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("N�o consegui pausar");
		}
	}	
}
