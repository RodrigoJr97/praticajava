package calculanota;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe quantidade de pessoas?");

		double nCarros = Double.parseDouble(carros);
		double nPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (nCarros / nPessoas);

		double resto = nCarros % nPessoas;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");


		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Deu: " + divisao + " carros para cada.");
		} else {
			System.out.println("Ñ quer ver o resultado");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobrou: " + resto + " carros.");
		} else {
			System.out.println("Ñ quer ver o resultado");
		}

	}

}
