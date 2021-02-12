/*
 * 5) Fazer um programa para ler um vetor de N números inteiros.
 * Em seguida, mostrar na tela a média aritmética somente dos números pares lidos. 
 */

package d_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vt05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, soma, contador;
		
		N = sc.nextInt();
		
		int[] vet = new int[N];
		
		soma = 0;
		contador = 0;
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				contador ++;
			}
		}
		
		double mediaPares = (double) soma / contador;
		
		System.out.printf("%.1f%n", mediaPares);
		
		sc.close();
	}
}