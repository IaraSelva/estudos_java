package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		
	double[] vetorA = new double[3];
	double[] vetorB = new double[vetorA.length];
	
	Scanner scan = new Scanner(System.in);
	
	for(int i=0; i<vetorA.length; i++) {
		System.out.println("Entre com um valor para o vetor A posição " + i);
		vetorA[i] = scan.nextInt();
		
		vetorB[i] = Math.sqrt(vetorA[i]);
	}
	System.out.print("Vetor A = ");
	for(int i=0; i<vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
	}
	
	DecimalFormat df = new DecimalFormat("##.##");
	
	System.out.println();
	System.out.print("Vetor B = ");
	for(int i=0; i<vetorA.length; i++) {
		System.out.print(df.format(vetorB[i]) + " ");			
	}
}
}
