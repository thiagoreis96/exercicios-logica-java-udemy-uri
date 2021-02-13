package e_matrizes;

import java.util.Scanner;

public class Mt07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] valores = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		int linha = sc.nextInt() - 1;
		int ultimaP = valores[linha][N-1];
		
		for (int j=(N-1); j>=1; j--) {
			valores[linha][j] = valores[linha][j-1];
			}
		
		valores[linha][0] = ultimaP;
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}