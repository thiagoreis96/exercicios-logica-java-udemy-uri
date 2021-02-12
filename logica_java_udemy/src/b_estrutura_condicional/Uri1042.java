/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1042
 */

package b_estrutura_condicional;

import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a <= b && a <= c) {
			System.out.println(a);
			if (b <= c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b <= c) {
			System.out.println(b);
			if (a <= c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			} 
		} else {
			System.out.println(c);
			if (a <= b) {
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}
}
