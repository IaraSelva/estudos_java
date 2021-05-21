package decisaoLoops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�emro correspondente ao dia da semana:");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("N�o � um dia v�lido");
		}
		
		switch(diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia �til"); break;
		case 7:
		case 1: System.out.println("Fim de Semana"); break;
		default: System.out.println("N�o � um dia v�lido");
		}
	}

}
