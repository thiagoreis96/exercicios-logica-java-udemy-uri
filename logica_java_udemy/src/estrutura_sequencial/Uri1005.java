/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1005
 */

package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double MEDIA = (A * 3.5 + B * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();
	}
}
