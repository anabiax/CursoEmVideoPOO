package ObjetoParteTres;

//INTRODU��O AO CONCEITO DE POLIMORFISMO

public abstract class Animal {
	// classe abstrata � aquela que n pode virar um objeto, s� serve p/ efeitos de heran�a
	
	protected double peso;
	protected int idade;
	protected int membros;
	
	public void locomover() {
		
	}
	
	public void alimentar() {
		
	}
	
	public void emitirSom() {
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}
	
}
