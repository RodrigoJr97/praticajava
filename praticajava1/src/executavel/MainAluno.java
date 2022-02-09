package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import introducaopoo.Aluno;
import introducaopoo.Disciplina;

public class MainAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			Aluno aluno1 = new Aluno();

			String nome = JOptionPane.showInputDialog("Nome do " + qtd + "º Aluno?");
			String matricula = JOptionPane.showInputDialog("Matricula?");
			String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");

			aluno1.setNome(nome);
			aluno1.setMatricula(matricula);
			aluno1.setNomeEscola(nomeEscola);

			for (int i = 1; i <= 1; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + "?");
				String nota = JOptionPane.showInputDialog("Nota da Disciplina " + i + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(nota));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Quer remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Disciplina 1, 2, 3 ou 4");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}

		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			
			/*Substituir um obj de uma lista*/
			
			if (aluno.getNome().equalsIgnoreCase("rodrigo")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno trocado");
				trocar.setMatricula("1997");
				trocar.setNomeEscola("JDEV");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Java + Spring + JPA/Hibernate");
				disciplina.setNota(100);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			
			System.out.println("----------------------------------------");
			System.out.println("Nome do Aluno(a) " + aluno.getNome());
			System.out.println("Média: " + aluno.getMediaNota());
			System.out.println(aluno.getSituacaoAluno());

			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {

				Disciplina disciplina = aluno.getDisciplinas().get(posd);
				System.out.println("Matéria: " + disciplina.getDisciplina() + " - Nota: " + disciplina.getNota());

			}

		}

	}

}
