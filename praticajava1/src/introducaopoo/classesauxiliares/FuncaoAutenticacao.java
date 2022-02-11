package introducaopoo.classesauxiliares;

import introducaopoo.interfaces.PermitirAcesso;

/*Somente receber alguem que tenha o contrato com PermitirAcesso*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
