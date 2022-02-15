package cursojava.introducaopoo.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

	private String disciplina;
	private double[] nota = new double[4];

	public Disciplina() {

	}

	public Disciplina(String disciplina, double[] nota) {
		super();
		this.disciplina = disciplina;
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (double n : nota) {
			somaTotal += n;
		}
		
		return somaTotal / 4;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina: " + getDisciplina() + ", Nota = " + getNota();
	}

}
