package cursoBasico;

public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 15;
		boolean acompanhado = true;
		
		if (idade >= 18 || acompanhado) {
		
			System.out.println("você pode entrar");
			System.out.println("seja bem vindo ao canecão");
			
		} else {
			System.out.println("infelizmente você nao pode entrar");
			
		}
	}
}
