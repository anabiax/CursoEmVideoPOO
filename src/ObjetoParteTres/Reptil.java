package ObjetoParteTres;

public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("destro�ando algo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de um r�ptil");

	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
