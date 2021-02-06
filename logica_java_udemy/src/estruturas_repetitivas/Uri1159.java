/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1159
 */

package estruturas_repetitivas;

import java.util.Scanner;

public class Uri1159 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int X2, X3, X4, X5;
		
		while (X != 0) {
			 if (X % 2 != 0) {
				X = X + 1;
			}
			 
			X2 = X + 2;
			X3 = X + 4;
			X4 = X + 6;
			X5 = X + 8;
			
			int somaConsec = X + X2 + X3 + X4 + X5;
			System.out.println(somaConsec);
			X = sc.nextInt();
			
		}
		
		sc.close();
	}
}