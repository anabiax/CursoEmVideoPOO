package ObjetoParteDois;

public class Professor extends Pessoa {

	private String especialidade;
	private double salario;
	
	
	public void receberAumento(double aum) {
		this.salario += aum;
		System.out.println(nome + " recebeu um aumento de salário no valor de " + aum);
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
