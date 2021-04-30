package poo;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Antonio");
		f1.setSalario(2500.00);
		
		System.out.println("Nome: "+f1.getNome()+"\nSalário: "+f1.getSalario());
		
	}

}
