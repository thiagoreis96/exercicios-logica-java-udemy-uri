/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
 */

package a_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
	
		double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
	
		System.out.printf("MEDIA = %.1f%n", MEDIA);
	
		sc.close();
	}
}