package ObjetoParteTres;

public class Ave extends Animal{

	private String corPena;
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo frutinhas");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de ave");
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
}
