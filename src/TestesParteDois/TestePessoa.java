package TestesParteDois;

import ObjetoParteDois.Bolsista;
import ObjetoParteDois.Professor;
import ObjetoParteDois.Tecnico;
import ObjetoParteDois.Visitante;
import ObjetoParteDois.Aluno;

public class TestePessoa {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		
		Aluno a1 = new Aluno();
		a1.setNome("Ana");
		a1.setMatricula(142553);
		a1.setCurso("Desenvolvimento web front-end");
		a1.setIdade(22);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(144443);
		b1.setNome(" Beatriz");
		b1.setBolsa(0);
		b1.setSexo("F");
		b1.pagarMensalidade();
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Mari");
		t1.setMatricula(321123);
		t1.setSexo("F");
		t1.setCurso("Desenvolvimento web full stack");
		t1.praticar();
		
		Professor p1 = new Professor();
		p1.setNome("Guanabara");
		p1.setEspecialidade("Linguagem Java");
		p1.setIdade(40);
		p1.receberAumento(3000);
	}

}
