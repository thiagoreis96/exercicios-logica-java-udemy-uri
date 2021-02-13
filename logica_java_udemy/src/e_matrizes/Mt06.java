package e_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Mt06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[][] valores = new double[N][N];
		
		double somaP = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				valores[i][j] = sc.nextDouble();
				if (valores[i][j] > 0) {
					somaP += valores[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaP);
		
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j=0; j<N; j++) {
			System.out.print(valores[linha][j] + " ");
		}
		System.out.println();
		
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			System.out.print(valores[i][coluna] + " ");
		}
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<N; i++) {
			System.out.print(valores[i][i]+ " ");
		}
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (valores[i][j] < 0) {
					valores[i][j] = valores[i][j] * valores[i][j];
				}
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}