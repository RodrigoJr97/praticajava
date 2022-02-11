package cursojava.introducaopoo.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.introducaopoo.classes.Aluno;
import cursojava.introducaopoo.classes.Disciplina;
import cursojava.introducaopoo.classes.Secretario;
import cursojava.introducaopoo.classesauxiliares.FuncaoAutenticacao;
import cursojava.introducaopoo.constantes.StatusAluno;
import cursojava.introducaopoo.interfaces.PermitirAcesso;

public class MainAluno {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		/*Simples valida��o de acesso*/
		if (new FuncaoAutenticacao(permitirAcesso).autenticarCursoJava()) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		/*
		 * � uma lista que dentro dela tem uma chave que indentifica uma sequencia de
		 * valores
		 */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 3; qtd++) {
			Aluno aluno = new Aluno();

			String nome = JOptionPane.showInputDialog("Nome do " + qtd + "� Aluno?");
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

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) { /* Separar alunos em listas */
			if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getSituacaoAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}

		System.out.println("-------- Lista dos Aprovados --------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(aluno.getNome() + ", M�dia: " + aluno.getMediaNota());
		}

		System.out.println("-------- Lista de Recupera��o --------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome() + ", M�dia: " + aluno.getMediaNota());
		}

		System.out.println("-------- Lista dos Reprovados --------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getNome() + ", M�dia: " + aluno.getMediaNota());
		}
		
		

	} else {
		JOptionPane.showInternalMessageDialog(null, "Acesso Negado");
	}
		
  }

}
