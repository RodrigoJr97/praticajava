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

		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + "?");
			String nota = JOptionPane.showInputDialog("Nota da Disciplina " + i + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));

			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Quer remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Disciplina 1, 2, 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		System.out.println(aluno1);
		System.out.println("Média: " + aluno1.getMediaNota());
		System.out.println(aluno1.getSituacaoAluno());

	}

}
