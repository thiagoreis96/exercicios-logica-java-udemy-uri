/*
 * 8) Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas.
 * Fazer um programa que calcule e escreva:
 * 
 * - A maior e a menor altura do grupo.
 * - A média de altura das mulheres.
 * - O número de homens.
 */

package d_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vt08 {
	
	public static void main(String[] atgs) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] alturas = new double[N];
		char[] sexos = new char[N];
		
		for (int i=0; i<N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}
		
		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];
		
		for (int i=0; i<N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			} else if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;
		double somaMulheres = 0;
		
		for (int i=0; i<N; i++) {
			if (sexos[i] == 'M') {
				quantidadeHomens ++;
			} else {
				quantidadeMulheres ++;
				somaMulheres += alturas[i];
			}
		}
		
		double mediaMulheres = somaMulheres / quantidadeMulheres;
		
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Número de hoemens = " + quantidadeHomens);
		
		sc.close();
	}
}