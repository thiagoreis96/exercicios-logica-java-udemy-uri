/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1014
 */

package a_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double kml = X / Y;
		
		System.out.printf("%.3f km/l%n", kml);
		
		sc.close();
	}
}
