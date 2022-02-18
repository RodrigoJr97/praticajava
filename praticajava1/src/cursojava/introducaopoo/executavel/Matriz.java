package cursojava.introducaopoo.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int[][] numeros = new int[2][4];
		
		numeros[0][0] = 97;
		numeros[0][1] = 24;
		numeros[0][2] = 12;
		numeros[0][3] = 17;
		
		numeros[1][0] = 77;
		numeros[1][1] = 45;
		numeros[1][2] = 21;
		numeros[1][3] = 18;

		/*Percorrer as linhas do array*/
		for (int linha = 0; linha < numeros.length; linha++) {
			System.out.println("-----------------------------");
			
			/*Percorrer as colunas dentro de cada linha*/
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				System.out.println(numeros[linha][coluna]);
			}
			
		}
		
	}
	
}
