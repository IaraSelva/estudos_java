package Arrays;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um valor para o vetor A posição " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");			
		}
	}

}
