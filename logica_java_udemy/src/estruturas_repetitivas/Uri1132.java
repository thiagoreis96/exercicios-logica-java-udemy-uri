/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1132
 */

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