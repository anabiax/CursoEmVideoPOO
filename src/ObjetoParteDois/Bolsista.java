package ObjetoParteDois;

public final class Bolsista extends Aluno{

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de " + nome);
	}
	
	@Override // sobrepondo o método
	public void pagarMensalidade() {
		System.out.println(nome + " é bolsista!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
