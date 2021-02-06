package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1144 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int primeiro = 1;
		
		for (int i=0; i<N; i++) {
			int segundo = primeiro * primeiro;
			int terceiro = primeiro * segundo;
			int second = segundo + 1;
			int third = terceiro + 1;
			
			System.out.printf("%d %d %d", primeiro, segundo, terceiro);
			System.out.println();
			System.out.printf("%d %d %d", primeiro, second, third);
			System.out.println();
			
			primeiro += 1;
		}
		
		sc.close();
	}
}