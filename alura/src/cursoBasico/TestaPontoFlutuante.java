package cursoBasico;

public class TestaPontoFlutuante {
	
	private static double idade;

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		setIdade(37);
		
		double divisao = 3.14/2;
		System.out.println(divisao);
	}

	public static double getIdade() {
		return idade;
	}

	public static void setIdade(double idade) {
		TestaPontoFlutuante.idade = idade;
	}

}
