package Collections;

public class Aluno {
	private String nome;
	private String curso;
	private double nota;
	
	public Aluno(String n, String c, double nt) {
		this.nome = n;
		this.curso = c;
		this.nota = nt;
	}
	
	public String toString() {
		return this.nome+this.curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
