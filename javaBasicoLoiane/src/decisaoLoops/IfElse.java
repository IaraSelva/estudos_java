package decisaoLoops;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		System.out.println("Qual sua idade?");
		Scanner scan = new Scanner(System.in);
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("Não é maior de idade");
		}
		
		System.out.println("Entre com o preço do produto");
		double preco = scan.nextDouble();
		
		if(preco <= 10) {
			System.out.println("Está barato");
		}else if(preco > 10 && preco < 15) {
			System.out.println("Pedir desconto");
		}else if(preco >= 15 && preco < 17) {
			System.out.println("Pesquisar mais");
		}else {
			System.out.println("Está muito caro");
		}
	}

}
