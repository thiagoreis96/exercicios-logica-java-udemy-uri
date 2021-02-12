/*
 * 7) Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
 * Cada uma dessas informações deve ser armazenada em um vetor.
 * Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.
 */

package d_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vt07 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		double[] media = new double[N];

		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");

		for(int i=0; i<N; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
			if (media[i] >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}