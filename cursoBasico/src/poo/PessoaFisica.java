package poo;

public class PessoaFisica extends PessoaP {
	private long CPF;
	
	public PessoaFisica() {
		
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cpf) {
		CPF = cpf;
	}
	
	public String dados() {
		
		return "Pessoa Física: "+super.getNome()+" CPF: "+this.getCPF();
	}
	

}
