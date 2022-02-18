package cursojava.introducaopoo.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "Rodrigo,Curso Java Web Full Stack,80,90,85,97";
		
		/*Define que ele vai quebrar a string por virgula*/
		String[] valoresArray = texto.split(",");
		
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Nome Curso:" + valoresArray[1]);
		System.out.println("Nota 1:" + valoresArray[2]);
		System.out.println("Nota 2:" + valoresArray[3]);
		System.out.println("Nota 3:" + valoresArray[4]);
		System.out.println("Nota 4:" + valoresArray[5]);
		
		/*Converter Array para Lista*/		
		List<String> list = Arrays.asList(valoresArray);
		System.out.println("Lista");
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/*Converter Lista para Array*/
		String[] conversaoArray = list.toArray(new String[6]);
		System.out.println("Array");
		for (int i = 0; i < conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
		
	}

}
