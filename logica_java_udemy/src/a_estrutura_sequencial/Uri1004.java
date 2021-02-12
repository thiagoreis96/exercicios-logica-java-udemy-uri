/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1004
 */

package a_estrutura_sequencial;

import java.util.Scanner;

public class Uri1004 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}
}