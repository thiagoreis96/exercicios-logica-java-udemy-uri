/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1016
 */

package a_estrutura_sequencial;

import java.util.Scanner;

public class Uri1016 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = 2 * A;
		
		System.out.println(B + " minutos");
		
		sc.close();
	}
}