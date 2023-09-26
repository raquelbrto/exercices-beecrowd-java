package exercices.module01;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		double raio = scan.nextDouble();
		double n = 3.14159;
		
		double area = n * (raio * raio);
		
		System.out.println("A=" + String.format("%.4f", area));
		scan.close();
	}

}
