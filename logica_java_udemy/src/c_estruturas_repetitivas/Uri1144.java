/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1144
 */

package c_estruturas_repetitivas;

import java.util.Scanner;

public class Uri1144 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, quadrado, cubo, contador;
		
		N = sc.nextInt();
		contador = 1;
		
		for (int i=1; i<=N; i++) {
			System.out.print(contador + " ");
			quadrado = contador * contador;
			System.out.print(quadrado + " ");
			cubo = contador * quadrado;
			System.out.println(cubo);
			
			System.out.print(contador + " ");
			System.out.print(quadrado + 1 + " ");
			System.out.println(cubo + 1);
			contador ++;
		}
		
		sc.close();	
	}
}