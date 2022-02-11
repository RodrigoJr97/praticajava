package praticando.classes;

import java.util.Objects;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String nomePai;
	private String nomeMae;
	private String dataNascimento;
	private int idade;
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf, String rg, String nomePai, String nomeMae, String dataNascimento,
			int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, rg);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(rg, other.rg);
	}
	@Override
	public String toString() {
		System.out.println("---------------------------------------------");
		return "Nome: " + getNome() + "\n"
			  + "CPF: " + getCpf() + "\n"
			  + "RG: " + getRg() + "\n"
			  + "Nome do Pai: " + getNomePai() + "\n"
			  + "Nome da Mãe: " + getNomeMae() + "\n"
			  + "Data de Nascimento: " + getDataNascimento() + "\n"
			  + "Idade: " + getIdade();
	}
	
	

}
