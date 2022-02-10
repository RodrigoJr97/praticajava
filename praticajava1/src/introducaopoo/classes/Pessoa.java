package introducaopoo.classes;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String rg;
	protected int idade;
	protected String dataNascimento;
	protected String nomePai;
	protected String nomeMae;
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(String nome, String cpf, String rg, int idade, String dataNascimento, String nomePai,
			String nomeMae) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	/*Método que as subclasses são obrigadas a implementar*/
	public abstract double salario();

}
