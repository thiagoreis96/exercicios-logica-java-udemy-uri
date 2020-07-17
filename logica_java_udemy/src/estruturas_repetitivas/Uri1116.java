package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double media = (double) X / Y;
				System.out.printf("%.1f%n", media);
			}
			
		}
		
		sc.close();
	}
}