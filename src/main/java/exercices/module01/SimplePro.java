package exercices.module01;

import java.util.Scanner;

public class SimplePro {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int produto = a * b;
		
		System.out.println("PROD = " + produto);
		scan.close();

	}

}
