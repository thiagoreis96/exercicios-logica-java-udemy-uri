package estruturas_repetitivas;

import java.util.Scanner;

public class Uri1132 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int min, max, soma = 0;
		
		if (X > Y) {
			max = X;
			min = Y;
		} else {
			max = Y;
			min = X;
		}
		
		for (int i=min; i<=max; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}