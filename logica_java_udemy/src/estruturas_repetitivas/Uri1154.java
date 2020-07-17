package estruturas_repetitivas;

import java.util.Scanner;
import java.util.Locale;

public class Uri1154 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int contador = 0;
		int soma = 0;
		
		while (idade >= 0) {
			soma += idade;
			contador += 1;
			idade = sc.nextInt();
		}
		
		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.printf("%.2f%n", media);
		}
		
		sc.close();
	}
}