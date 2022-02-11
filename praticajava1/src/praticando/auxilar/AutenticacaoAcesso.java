package praticando.auxilar;

import praticando.interfaces.Acesso;

public class AutenticacaoAcesso {
	
	private Acesso acesso;
	
	public boolean confirmarAutenticacao() {
		return acesso.autenticarAcesso();
	}

	public AutenticacaoAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
	
	

}
