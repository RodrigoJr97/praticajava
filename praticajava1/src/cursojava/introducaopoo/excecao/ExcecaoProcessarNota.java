package cursojava.introducaopoo.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Erro no processar as notas do aluno " + erro);
	}

}
