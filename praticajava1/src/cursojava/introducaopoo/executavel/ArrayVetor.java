package cursojava.introducaopoo.executavel;

import cursojava.introducaopoo.classes.Aluno;
import cursojava.introducaopoo.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {

		double[] notas = { 24.5, 20.9, 31.7, 23.8 };
		double[] notas2 = { 28.9, 31.9, 25.7, 33.8 };
		double[] notas3 = { 23.7, 18.9, 34.5, 28.9 };
		double[] notas4 = { 22.9, 30.2, 27.3, 33.0 };

		Aluno aluno = new Aluno("Rodrigo", "0097", "JDev Treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java + Spring + SQL");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno("Karina", "0124", "Unipac");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Biologia");
		disciplina3.setNota(notas3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Fisica");
		disciplina4.setNota(notas4);
		
		aluno2.getDisciplinas().add(disciplina3);
		aluno2.getDisciplinas().add(disciplina4);
		
		//-----------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		/*For para percorrer o array de alunos*/
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("----------------------------------");
			System.out.println("Nome do Aluno(a): " + arrayAlunos[pos].getNome());
			
			/*For que recupera a lista de disciplinas do aluno*/
			for (Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("\nDisciplina: " + disc.getDisciplina());
				
				/*For para percorrer o array de notas de cada disciplina*/
				for (int posnota = 0; posnota < disc.getNota().length; posnota++) {
					System.out.println((posnota+1) + "º Nota: " + disc.getNota()[posnota]);
				}
				
			}
			
		}

	}
}
