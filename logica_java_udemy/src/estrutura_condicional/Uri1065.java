package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		
		int soma = 0;
		
		if(a % 2 == 0) {
			soma = soma + 1;
		} if(b % 2 == 0) {
			soma = soma + 1;
		} if(c % 2 == 0) {
			soma = soma + 1;
		} if(d % 2 == 0) {
			soma = soma + 1;
		} if(e % 2 == 0) {
			soma = soma + 1; 
		}
		
		System.out.println(soma + " valores pares");
		
		sc.close();
	
	}
}