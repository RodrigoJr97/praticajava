package calculanota;

import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = 25, n2 = 45, n3 = 30, n4 = 34;
		int media = (n1+n2+n3+n4) / 4;
		
		System.out.println("Média é: " + media);
		
	}

}
