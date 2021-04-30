package poo;

public class Funcionario1 extends Pessoas {
	
	private String departamento;
	private double salario;

	public Funcionario1(String nome, int matricula, String departamento, double salario) {
		super(nome, matricula);
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	
	
}
