package ObjetosParteUm;

public class Funcionario extends PessoaH {

	private String setor;
	private boolean trabalhando;
	

	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando; // far� receber o inverso
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
