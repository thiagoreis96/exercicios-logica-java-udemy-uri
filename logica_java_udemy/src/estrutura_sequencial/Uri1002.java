package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		raio = sc.nextDouble();
		
		pi = 3.14159;
		area = pi * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}
}