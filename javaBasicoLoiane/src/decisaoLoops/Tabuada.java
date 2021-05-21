package decisaoLoops;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual tabuada você quer consultar?");
		int tabuada = scan.nextInt();
		int inicio = 0;
		
		while (inicio <= 10) {
			System.out.println(tabuada + " x " + inicio + " = " + tabuada * inicio);
			inicio++;
		}
	}

}
