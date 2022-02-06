package executavel;

import javax.swing.JOptionPane;

import introducaopoo.Aluno;

public class MainAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Nome do Aluno?");
		String matricula = JOptionPane.showInputDialog("Matricula?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		
		String n1 = JOptionPane.showInputDialog("Nota 1?");
		String n2 = JOptionPane.showInputDialog("Nota 2?");
		String n3 = JOptionPane.showInputDialog("Nota 3?");
		String n4 = JOptionPane.showInputDialog("Nota 4?");
		
		
		aluno1.setNome(nome);
		aluno1.setMatricula(matricula);
		aluno1.setNomeEscola(nomeEscola);
		
		/*A gente recupera o obj que está dentro do aluno que está fazendo a referencia
		 * para um obj do tipo disciplina, depois setamos disiciplina e nota*/
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setNota1(Double.parseDouble(n1));
		
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setNota2(Double.parseDouble(n2));
		
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setNota3(Double.parseDouble(n3));
		
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		aluno1.getDisciplina().setNota4(Double.parseDouble(n4));
		
		System.out.println(aluno1);
		System.out.println(aluno1.getSituacaoAluno());

		
	}

}
