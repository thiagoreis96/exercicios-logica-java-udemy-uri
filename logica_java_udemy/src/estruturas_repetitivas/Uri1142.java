/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1142
 */

package estruturas_repetitivas;

import java.util.Scanner;
	
public class Uri1142 {
		
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		int N = sc.nextInt();
		int soma = 0;
			
		for (int i=0; i<N; i++) {
			if (soma > 1) {
				soma += 2;
				System.out.print(soma + " ");
			} else {
				soma += 1;
				System.out.print(soma + " ");
			}
			soma += 1;
			System.out.print(soma + " ");
			soma += 1;
			System.out.print(soma + " ");
			System.out.println("PUM");
		}
			
		sc.close();
	}
}