package cursoBasico;

public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 15;
		boolean acompanhado = true;
		
		if (idade >= 18 || acompanhado) {
		
			System.out.println("voc� pode entrar");
			System.out.println("seja bem vindo ao canec�o");
			
		} else {
			System.out.println("infelizmente voc� nao pode entrar");
			
		}
	}
}
