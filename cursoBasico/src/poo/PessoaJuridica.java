package poo;

public class PessoaJuridica extends PessoaP{
	private long CNPJ;
	
	public PessoaJuridica() {
		
	}

	public long getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String dados() {
		return "Pessoa Jur�dica: "+super.getNome()+" CNPJ: "+this.getCNPJ();
	}
	

}
