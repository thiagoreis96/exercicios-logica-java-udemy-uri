/*
 * 4) Fazer um programa para ler um vetor de N n�meros reais.
 * Em seguida, mostrar na tela a m�dia aritm�tica de todos os elementos.
 * Depois mostrar todos os elementos do vetor que estejam abaixo da m�dia.
 */

package d_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vt04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		double contador = 0;
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			contador += vet[i];
		}
		
		double media = contador / N;
		
		System.out.println(media);
		
		for (int i=0; i<N; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}