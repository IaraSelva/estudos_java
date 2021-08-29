package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir?");
        int qtd = scan.nextInt();

        double[] notas = new double[qtd];
        double media = 0;

        for (int i = 0; i < qtd; i++){
            System.out.println("Digite a nota " + (i+1) + ":");
            notas[i] = scan.nextDouble();
            media += notas[i]/qtd;
        }
        System.out.println(Arrays.toString(notas));
        System.out.println("Média = " + media);
    }
}