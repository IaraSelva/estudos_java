package poo;

public class TestePessoas {

	public static void main(String[] args) {

		Funcionario1 f1 = new Funcionario1("Joana", 9150366, "RH", 5500.00);
		Pessoas p1 = new Coordenador("Madalena", 8170455, "Gestão de T.I.");
		Coordenador c1 = new Coordenador("Paulo", 7170455, "Análise de Dados");
		
		System.out.println(f1.getDepartamento());
		System.out.println(f1.getNome());
		System.out.println(f1.getMatricula());
		System.out.println(p1.getNome());
		System.out.println(((Coordenador) p1).getCurso());
		System.out.println(c1.getCurso());
		
	}

}
