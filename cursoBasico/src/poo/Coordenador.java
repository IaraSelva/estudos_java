package poo;

public class Coordenador extends Pessoas {
	
	private String curso;

	
	public Coordenador(String nome, int matricula, String curso) {
		super(nome, matricula);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}

	
}
