package ObjetoParteDois;

public final class Tecnico extends Aluno {
	
	private int registroProfissional;
	
	public void praticar() {
		System.out.println(nome + " est� exercitando as habilidades t�cnicas do curso " + this.getCurso());
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	

}
