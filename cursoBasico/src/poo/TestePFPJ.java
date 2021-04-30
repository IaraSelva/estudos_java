package poo;

public class TestePFPJ {
	public static void main(String [] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Iara");
		pf.setCPF(40592225852L);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Generation");
		pj.setCNPJ(0414744412350001L);
		
		System.out.println(pj.dados());
		System.out.println(pf.dados());
		
		PessoaP[] p = new PessoaP[2];
		p[0]=pf;
		p[1]=pj;
		
		for(PessoaP i:p) {
			System.out.println(i.getNome());
		}
		
	}

}
