package executavel;

import javax.swing.JOptionPane;

import introducaopoo.Aluno;
import introducaopoo.Disciplina;

public class MainAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Nome do Aluno?");
		String matricula = JOptionPane.showInputDialog("Matricula?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		
		aluno1.setNome(nome);
		aluno1.setMatricula(matricula);
		aluno1.setNomeEscola(nomeEscola);
		
		Disciplina disc1 = new Disciplina("Java Básico", 10);
		Disciplina disc2 = new Disciplina("SQL Básico", 57);
		Disciplina disc3 = new Disciplina("Sring", 32);
		Disciplina disc4 = new Disciplina("Introdução a List", 22);
		
		aluno1.getDisciplinas().add(disc1);
		aluno1.getDisciplinas().add(disc2);
		aluno1.getDisciplinas().add(disc3);
		aluno1.getDisciplinas().add(disc4);
		
			
		System.out.println(aluno1);
		System.out.println(aluno1.getSituacaoAluno());

		
	}

}
