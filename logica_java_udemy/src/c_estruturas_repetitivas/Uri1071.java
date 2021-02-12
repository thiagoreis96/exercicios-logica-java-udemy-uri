/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1071
 */

package c_estruturas_repetitivas;

import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		
		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		
		int soma = 0;
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
