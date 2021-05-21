package decisaoLoops;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		System.out.print("Primeiro múltiplos de 7 nesse intervalo = ");

		for(int i=num; i<=max; i++) {
			if(i % 7 == 0) {
				System.out.print(i);
				continue;
			}
		}
	}

}
