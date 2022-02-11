package praticando.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import praticando.classes.Carro;
import praticando.constantes.Marca;

public class MainCarro {

	public static void main(String[] args) {

		// Carro carro1 = new Carro("BMW", "M4 Sport", "Preto", "BS001", 2020);
		// Carro carro2 = new Carro("VW", "Golf GTI", "Vermelho", "VG001", 2021);

		List<Carro> carros = new ArrayList<Carro>();
		
		String login = JOptionPane.showInputDialog("Digite seu Login");
		String senha = JOptionPane.showInputDialog("Digite sua Senha");
		
		if (login.equals("adm") && senha.equals("teste")) {

		String qtdCarro = JOptionPane.showInputDialog("Quantos carros quer adicionar?");
		int qtd = Integer.parseInt(qtdCarro);

		for (int i = 1; i <= qtd; i++) {

			String marca = JOptionPane.showInputDialog("Marca do " + i + "º Veiculo?");
			String modelo = JOptionPane.showInputDialog("Modelo?");
			String cor = JOptionPane.showInputDialog("Cor?");
			String codVeiculo = JOptionPane.showInputDialog("Código do Veiculo?");
			String ano = JOptionPane.showInputDialog("Ano?");

			Carro carro = new Carro();
			carro.setMarca(marca.toUpperCase());
			carro.setModelo(modelo);
			carro.setCor(cor);
			carro.setCodigoIdentificador(codVeiculo);
			carro.setAno(Integer.parseInt(ano));

			carros.add(carro);
		}

		HashMap<String, List<Carro>> maps = new HashMap<String, List<Carro>>();

		/*
		 * Aqui estamos definindo que para cada chave Constante que é do tipo String,
		 * vamos ter uma nova lista de carro
		 */
		maps.put(Marca.BMW, new ArrayList<Carro>());
		maps.put(Marca.GM, new ArrayList<Carro>());
		maps.put(Marca.FORD, new ArrayList<Carro>());
		maps.put(Marca.VW, new ArrayList<Carro>());
		maps.put(Marca.TOYOTA, new ArrayList<Carro>());

		
		/*Laço para percorrer e separar carros por marca*/
		for (Carro carro : carros) {
			if (carro.getMarca().equalsIgnoreCase("bmw")) {
				maps.get(Marca.BMW).add(carro);
			} else if (carro.getMarca().equalsIgnoreCase("gm")) {
				maps.get(Marca.GM).add(carro);
			} else if (carro.getMarca().equalsIgnoreCase("ford")) {
				maps.get(Marca.FORD).add(carro);
			} else if (carro.getMarca().equalsIgnoreCase("vw")) {
				maps.get(Marca.VW).add(carro);
			} else if (carro.getMarca().equalsIgnoreCase("toyota")) {
				maps.get(Marca.TOYOTA).add(carro);
			}
		}
		
		/*Condição para NÃO imprimir lista se estiver vazia*/
		if (!maps.get(Marca.BMW).isEmpty()) {			
			System.out.println("------------- BMW -------------");
			for (Carro carro : maps.get(Marca.BMW)) {
				System.out.println(carro);
			}			
		}
		
		if (!maps.get(Marca.GM).isEmpty()) {
			System.out.println("------------- GM -------------");
			for (Carro carro : maps.get(Marca.GM)) {
				System.out.println(carro);
			}			
		}

		if (!maps.get(Marca.FORD).isEmpty()) {
			System.out.println("------------- FORD -------------");
			for (Carro carro : maps.get(Marca.FORD)) {
				System.out.println(carro);
			}			
		}

		if (!maps.get(Marca.VW).isEmpty()) {
			System.out.println("------------- VW -------------");
			for (Carro carro : maps.get(Marca.VW)) {
				System.out.println(carro);
			}			
		}

		if (!maps.get(Marca.TOYOTA).isEmpty()) {
			System.out.println("------------- TOYOTA -------------");
			for (Carro carro : maps.get(Marca.TOYOTA)) {
				System.out.println(carro);
			}			
		}
		

	} else { 
		JOptionPane.showInternalMessageDialog(null, "ERRO! Login ou Senha Inválido.");
	}
		
		
		
	}

}
