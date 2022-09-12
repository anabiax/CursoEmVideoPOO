package Testes;

import ObjetosParteUm.Aluno;
import ObjetosParteUm.Funcionario;
import ObjetosParteUm.PessoaH;
import ObjetosParteUm.Professor;

public class TestePessoaH {
	
	public static void main(String[] args) {
		
		PessoaH p1 = new PessoaH();
		p1.setNome("Beatriz");
		p1.setIdade(23);
		p1.setSexo("F");
		
		Aluno p2 = new Aluno();
		p2.setNome("Ana");
		p2.setCurso("Desenvolvimento web");
		p2.setIdade(21);
		p2.setSexo("F");
		
		Professor p3 = new Professor();
		p3.setNome("Guanabara");
		p3.setSalario(3500.75f);
		p3.setSexo("M");
		p3.ReceberAum(2500.15f);
		
		Funcionario p4 = new Funcionario();
		p4.setNome("Pedro");
		p4.setSetor("T.I.");
		p4.setSexo("M");
		p4.setIdade(24);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

		
	}

}
