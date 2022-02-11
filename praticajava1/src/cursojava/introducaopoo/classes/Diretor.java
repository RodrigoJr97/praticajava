package cursojava.introducaopoo.classes;

public class Diretor extends Pessoa{
	
	private String registroEducacao;
	private String titulacao;
	private int tempoDirecao;
	
	
	public Diretor() {
		super();
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


	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", titulacao=" + titulacao + ", tempoDirecao="
				+ tempoDirecao + ", nome=" + nome + ", idade=" + idade + "]";
	}


	@Override
	public double salario() {
		return 3900.90;
	}
	
	

}
