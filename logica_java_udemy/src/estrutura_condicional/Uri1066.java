/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1066
 */

package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1066 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		
		int somaPar = 0;
		int somaImpar = 0;
		int somaPositivo = 0;
		int somaNegativo = 0;
		
		if(a > 0) {
			somaPositivo += 1;
		} else if (a < 0) {
			somaNegativo += 1;
		} if(b > 0) {
			somaPositivo += 1;
		} else if (b < 0) {
			somaNegativo += 1;
		} if(c > 0) {
			somaPositivo += 1;
		} else if (c < 0) {
			somaNegativo += 1;
		} if(d > 0) {
			somaPositivo += 1;
		} else if (d < 0) {
			somaNegativo += 1;
		} if(e > 0) {
			somaPositivo += 1;
		} else if (e < 0) {
			somaNegativo += 1;
		} if (a % 2 == 0) {
			somaPar += 1;
		} else {
			somaImpar += 1;
		} if (b % 2 == 0) {
			somaPar += 1;
		} else {
			somaImpar += 1;
		} if (c % 2 == 0) {
			somaPar += 1;
		} else {
			somaImpar += 1;
		} if (d % 2 == 0) {
			somaPar += 1;
		} else {
			somaImpar += 1;
		} if (e % 2 == 0) {
			somaPar += 1;
		} else {
			somaImpar += 1;
		}
		
		System.out.println(somaPar + " valor(es) par(es)");
		System.out.println(somaImpar + " valor(es) impar(es)");
		System.out.println(somaPositivo + " valor(es) positivo(s)");
		System.out.println(somaNegativo + " valor(es) negativo(s)");
		
		sc.close();
	}
}