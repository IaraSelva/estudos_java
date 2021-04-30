package poo;

public class Pessoa {
	
	private String primNome;
	private String ultmNome;
	private String meioNome;

	public Pessoa(String prim, String meio, String ultm) {
		
		this.primNome = prim;
		this.ultmNome = ultm;
		this.meioNome = meio;
	}

	public void escreverNomeCompleto() {
		
		String nomeCompleto = this.primNome+" "+this.meioNome+" "+this.ultmNome;
		System.out.println(nomeCompleto);
	}
}

