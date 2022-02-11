package praticando.classes;

import java.util.Objects;

import praticando.interfaces.Acesso;

public class Gerente extends Pessoa implements Acesso {

	private double salario;
	private String registro;

	private String login;
	private String senha;

	public Gerente() {
		super();
	}

	public Gerente(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(registro);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		return Objects.equals(registro, other.registro);
	}

	@Override
	public String toString() {
		return "Gerente - Nome: " + getNome() + "\n" + "Registro: " + getRegistro() + "\n" + "Salário: R$"
				+ getSalario();
	}

	@Override
	public boolean autenticarAcesso(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticarAcesso();
	}

	@Override
	public boolean autenticarAcesso() {
		return login.equals("adm") && senha.equals("teste");
	}

}
