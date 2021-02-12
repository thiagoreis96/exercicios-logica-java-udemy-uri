/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1037
 */

package b_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		String intervalo;
		
		if (x >= 0 && x <= 25) {
			intervalo = "Intervalo [0,25]";
		} else if (x > 25 && x <= 50) {
			intervalo = "Intervalo (25,50]";
		} else if (x > 50 && x <= 75) {
			intervalo = "Intervalo (50,75]";
		} else if (x > 75 && x <= 100) {
			intervalo = "Intervalo (75,100]";
		} else {
			intervalo = "Fora de intervalo";
		}
		
		System.out.println(intervalo);
		
		sc.close();
	}
}
