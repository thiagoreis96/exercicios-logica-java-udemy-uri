/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1048
 */

package b_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, reajuste;
		int porcentagem;
		
		salario = sc.nextDouble();
		
		if (salario <= 400.00) {
			porcentagem = 15;
		} else if (salario > 400.00 && salario <= 800.00)  {
			porcentagem = 12;
		} else if (salario > 800.00 && salario <= 1200.00) {
			porcentagem = 10;
		} else if (salario > 1200.00 && salario <= 2000.00) {
			porcentagem = 7;
		} else {
			porcentagem = 4;
		}
		
		
		reajuste = salario * porcentagem / 100;
		novoSalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + porcentagem + " %");
		
		sc.close();
	}
}