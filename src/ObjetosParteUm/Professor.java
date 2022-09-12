package ObjetosParteUm;

public class Professor extends PessoaH {
	
	private String especialidade;
	private double salario;
	
	
	public void ReceberAum(double aum) {
		this.salario += aum;
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

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
