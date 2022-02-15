package cursojava.introducaopoo.executavel;

import cursojava.introducaopoo.classes.Aluno;
import cursojava.introducaopoo.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {

		double[] notas = { 24.5, 20.9, 31.7, 23.8 };
		double[] notas2 = { 28.9, 31.9, 25.7, 33.8 };

		Aluno aluno = new Aluno("Rodrigo", "0097", "JDev Treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java + Spring + SQL");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome Aluno: " + aluno.getNome());
		System.out.println("Escola: " + aluno.getNomeEscola());
		System.out.println("Matricula Aluno: " + aluno.getMatricula());

		for (Disciplina disc : aluno.getDisciplinas()) {
			double maiorNota = 0.0;
			double menorNota = 0.0;

			System.out.println("-----------------------------------------");
			System.out.println("Disciplina: " + disc.getDisciplina());

			for (int pos = 0; pos < disc.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + ": " + disc.getNota()[pos]);

				if (pos == 0) {
					maiorNota = disc.getNota()[pos];
					menorNota = disc.getNota()[pos];
				} else {
					if (disc.getNota()[pos] > maiorNota) {
						maiorNota = disc.getNota()[pos];
					}

					if (disc.getNota()[pos] < menorNota) {
						menorNota = disc.getNota()[pos];
					}

				}

			}

			System.out.println("Maior Nota: " + maiorNota);
			System.out.println("Menor Nota: " + menorNota);

		}

	}
}
