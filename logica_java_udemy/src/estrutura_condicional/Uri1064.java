/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1064
 */

package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		int soma = 0;
		double somador = 0;
		
		if(a > 0) {
			soma = soma + 1;
			somador = somador + a;
		} if(b > 0) {
			soma = soma + 1;
			somador = somador + b;
		} if(c > 0) {
			soma = soma + 1;
			somador = somador + c;
		} if(d > 0) {
			soma = soma + 1;
			somador = somador + d;
		} if(e > 0) {
			soma = soma + 1;
			somador = somador + e;
		} if(f > 0) {
			soma = soma + 1;
			somador = somador + f;
		} 
		
		double media = somador / soma;
		
		System.out.println(soma + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}
}