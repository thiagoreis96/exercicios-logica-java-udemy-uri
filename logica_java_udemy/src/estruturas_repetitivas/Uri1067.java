/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1067
 */

package estruturas_repetitivas;

import java.util.Scanner;

public class Uri1067 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for (int i=1; i<=X; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
