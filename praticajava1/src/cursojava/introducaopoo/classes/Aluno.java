package cursojava.introducaopoo.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.introducaopoo.constantes.StatusAluno;

public class Aluno extends Pessoa{

	private String matricula;
	private String nomeEscola;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {

	}

	public Aluno(String nome, String matricula, String nomeEscola) {
		super.nome = nome;
		this.matricula = matricula;
		this.nomeEscola = nomeEscola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		super.nome = nome;
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
		return "Nome do Aluno: " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula() + "\nNome Escola: " + getNomeEscola()
				+ "\n" + getDisciplinas();
	}

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	public String getSituacaoAluno() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 60) {
				return StatusAluno.APROVADO;
			}
			return StatusAluno.RECUPERACAO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}

	@Override
	public double salario() {
		return 1500.0;
	}
	
}
