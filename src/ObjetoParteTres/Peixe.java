package ObjetoParteTres;

public class Peixe extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("peixinho menor hm");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("glub glub");
	}
	
	public void soltarBolhas() {
		System.out.println("Soltou bolhinhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
