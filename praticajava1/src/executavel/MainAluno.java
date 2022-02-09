package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import introducaopoo.Aluno;
import introducaopoo.Disciplina;
import introducaopoo.constantes.StatusAluno;

public class MainAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {
			Aluno aluno = new Aluno();

			String nome = JOptionPane.showInputDialog("Nome do " + qtd + "º Aluno?");
			String matricula = JOptionPane.showInputDialog("Matricula?");
			String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");

			aluno.setNome(nome);
			aluno.setMatricula(matricula);
			aluno.setNomeEscola(nomeEscola);

			for (int i = 1; i <= 1; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + "?");
				String nota = JOptionPane.showInputDialog("Nota da Disciplina " + i + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(nota));

				aluno.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Quer remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Disciplina 1, 2, 3 ou 4");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno);
		}
		
		for (Aluno aluno : alunos) {    /*Separar alunos em listas*/
			if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("-------- Lista dos Aprovados --------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println(aluno.getNome() + ", Média: " + aluno.getMediaNota());
		}
		
		System.out.println("-------- Lista de Recuperação --------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println(aluno.getNome() + ", Média: " + aluno.getMediaNota());
		}
		
		System.out.println("-------- Lista dos Reprovados --------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println(aluno.getNome() + ", Média: " + aluno.getMediaNota());
		}
		
	}

}
