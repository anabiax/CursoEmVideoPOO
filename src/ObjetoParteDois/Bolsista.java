package ObjetoParteDois;

public final class Bolsista extends Aluno{

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de " + nome);
	}
	
	@Override // sobrepondo o m�todo
	public void pagarMensalidade() {
		System.out.println(nome + " � bolsista!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
