package estrutura_condicional;

import java.util.Scanner;

public class Uri1070 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			x = x + 1;
		}
		
		int a = x + 2;
		int b = a + 2;
		int c = b + 2;
		int d = c + 2;
		int e = d + 2;
		
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		sc.close();
	}
}