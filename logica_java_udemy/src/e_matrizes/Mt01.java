/*
 * 1) Ler dois n�meros M e N, e depois ler uma matriz MxN de n�meros inteiros.
 * Em seguida, mostrar na tela somente os n�meros negativos da matriz.
 * 
 * Entrada:
 * A entrada cont�m os n�meros M e N na mesma linha, depois os dados da matriz.
 * 
 * Sa�da:
 * A sa�da cont�m a mensagem "VALORES NEGATIVOS:" e depois os n�meros negativos da matriz, um por linha.
 */

package e_matrizes;

import java.util.Scanner;

public class Mt01 {
	
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
		
		System.out.println("VALORES NEGATIVOS:");
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (valores[i][j] < 0) {
					System.out.println(valores[i][j]);
				}
			}
		}
		
		sc.close();
	}
}