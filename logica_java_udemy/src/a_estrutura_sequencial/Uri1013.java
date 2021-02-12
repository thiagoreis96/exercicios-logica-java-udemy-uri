/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1013
 */

package a_estrutura_sequencial;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, z, k, t;

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		k = (x + y + Math.abs(x - y)) / 2;

		t = (k + z + Math.abs(k - z)) / 2;

		System.out.println(t + " eh o maior");

		sc.close();
	}
}
