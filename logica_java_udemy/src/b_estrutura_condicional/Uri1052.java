/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1052
 */

package b_estrutura_condicional;

import java.util.Scanner;

public class Uri1052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String mes;
		
		switch (N) {
		case 1: 
			mes = "January";
			break;
		case 2: 
			mes = "February";
			break;
		case 3: 
			mes = "March";
			break;
		case 4: 
			mes = "April";
			break;
		case 5: 
			mes = "May";
			break;
		case 6: 
			mes = "June";
			break;
		case 7: 
			mes = "July";
			break;
		case 8: 
			mes = "August";
			break;
		case 9: 
			mes = "September";
			break;
		case 10: 
			mes = "October";
			break;
		case 11: 
			mes = "November";
			break;
		case 12: 
			mes = "December";
			break;
		default:
			mes = "Invalid value";
			break;
		}
		
		System.out.println(mes);
		
		sc.close();
	}
}