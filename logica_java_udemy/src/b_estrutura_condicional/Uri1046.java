/* 
 * Para não poluir esta página, não coloquei o enunciado do exercício aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1046
 */

package b_estrutura_condicional;

import java.util.Scanner;

public class Uri1046 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int duracao;
		
		if(hi < hf) {
			duracao = hf - hi;
		} else {
			duracao = 24 - hi + hf;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
