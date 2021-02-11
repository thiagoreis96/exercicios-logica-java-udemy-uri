/*
 * 9) Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa.
 * Para isto, mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas.
 * Fazer um programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
 * 
 * - Lucro menor que 10%
 * - Lucro maior ou igual a 10% e menor ou igual a 20%
 * - Lucro maior que 20%
 * 
 * Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
 */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vt09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] produtos = new String[N];
		double[] preco1 = new double[N];
		double[] preco2 = new double[N];
		
		for (int i=0; i<N; i++) {
			produtos[i] = sc.next();
			preco1[i] = sc.nextDouble();
			preco2[i] = sc.nextDouble();	
		}
		
		int lucroP = 0;
		int lucroM = 0;
		int lucroG = 0;
		double totalCompra = 0;
		double totalVenda = 0;
		
		for (int i=0; i<N; i++) {
			if (preco2[i] < preco1[i] + (preco1[i] * 0.1)) {
				lucroP ++;
			} else if (preco2[i] >= preco1[i] + (preco1[i] * 0.1) && preco2[i] <= preco1[i] + (preco1[i] * 0.2)) {
				lucroM ++;
			} else {
				lucroG ++;
			}
			totalCompra += preco1[i];
			totalVenda += preco2[i];
		}
		
		double totalLucro = totalVenda - totalCompra;
		
		System.out.println("Lucro abaixo de 10%: " + lucroP);
		System.out.println("Lucro entre 10% e 20%: " + lucroM);
		System.out.println("Lucro acima de 20%: " + lucroG);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		sc.close();
	}
}
