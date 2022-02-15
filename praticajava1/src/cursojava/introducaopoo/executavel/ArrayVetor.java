package cursojava.introducaopoo.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		String qtdNotas = JOptionPane.showInputDialog("Quantas notas deseja adicionar?");
		
				
		double[] notas = new double[Integer.parseInt(qtdNotas)];
				
		double aux = 0;
		
		for (int i = 0; i < notas.length; i++) {
			String nota = JOptionPane.showInputDialog((i+1) + "º Nota?");
			notas[i] = Double.parseDouble(nota);
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
			aux += notas[i];
		}
		
		
		System.out.println("Soma: " + aux);
		
	}
}
