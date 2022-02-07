package introducaopoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private String matricula;
	private String nomeEscola;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {

	}

	public Aluno(String nome, String matricula, String nomeEscola) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeEscola = nomeEscola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Nome do Aluno: " + getNome() + "\nMatricula: " + getMatricula() + "\nNome Escola: " + getNomeEscola()
				+ "\n" + getDisciplinas();
	}

	public double getMediaNota() {
		double nota = 0;
		for (int i = 0; i < disciplinas.size(); i++) {
			double notaAux = disciplinas.get(i).getNota();
			nota += notaAux;
		}
	    
		return nota / 4;
	}

	public String getSituacaoAluno() {
		double media = this.getMediaNota();
		if (media >= 60) {
			if (media >= 90 || media == 100) {
				return "APROVADO Com Excelencia. M�dia: " + getMediaNota();
			}
			return "APROVADO. M�dia: " + getMediaNota();
		} else {
			return "REPROVADO M�dia: " + getMediaNota();
		}
	}

}
