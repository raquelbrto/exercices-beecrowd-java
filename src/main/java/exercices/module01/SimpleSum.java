package exercices.module01;

import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		scan.close();
	}

}
