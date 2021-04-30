package poo;

public class Participante implements Leitor,Programador {

	String pensamento;

	@Override
	public void pensando(char[] ideias) {
		this.pensamento = new String(ideias);
	}

	@Override
	public String digitando() {
		return pensamento;
	}

	@Override
	public String lendo() {
		return "Fórum";
	}
	
	private String aprendendo() {
		return "Java";
	}
}

