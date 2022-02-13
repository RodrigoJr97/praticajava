package cursojava.introducaopoo.classes;

import cursojava.introducaopoo.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private String titulacao;
	private int tempoDirecao;

	private String login;
	private String senha;

	public Diretor() {
		super();
	}

	public Diretor(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Diretor(String registroEducacao, String titulacao, int tempoDirecao) {
		super();
		this.registroEducacao = registroEducacao;
		this.titulacao = titulacao;
		this.tempoDirecao = tempoDirecao;
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", titulacao=" + titulacao + ", tempoDirecao="
				+ tempoDirecao + ", nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public double salario() {
		return 3900.90;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("diretor") && senha.equals("123");
	}

}
