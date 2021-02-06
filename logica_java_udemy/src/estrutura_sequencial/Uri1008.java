package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nf = sc.nextInt();
		int ht = sc.nextInt();
		double vh = sc.nextDouble();
		
		double salary = ht * vh;
		
		System.out.println("NUMBER = " + nf);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
