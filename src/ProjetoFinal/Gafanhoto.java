package ProjetoFinal;

public class Gafanhoto extends Pessoaa {

	private String login;
	private int totAssistido;
	
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo); // puxa de Pessoaa
		this.login = login;
		this.totAssistido = 0;
	}

	
	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + login + ", totAssistido=" + totAssistido + "]";
	}                          // CHAMANDO PESSOAA


	public void viuMaisUm() {
		
	} 

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
}
