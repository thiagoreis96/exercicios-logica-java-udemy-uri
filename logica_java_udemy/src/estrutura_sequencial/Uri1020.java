/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1018
 */

package estrutura_sequencial;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, anos, meses, dias, resto;
		
		x = sc.nextInt();
		
		anos = x / 365;
		resto = x % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}
}