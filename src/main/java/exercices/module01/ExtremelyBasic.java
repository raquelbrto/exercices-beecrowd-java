package exercices.module01;

import java.util.Scanner;

public class ExtremelyBasic {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int x =  a + b;

		System.out.println("X = " + x);
		
		scan.close();
	}

}
