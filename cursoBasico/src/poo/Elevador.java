package poo;

public class Elevador {
	
	public int andarAtual;
	private int andaresTotal;
	private int capacidade;
	private int pessoasPresentes;
	
	public Elevador() {
		//this.andarAtual = 0;
		//this.andaresTotal = 5;
		//this.capacidade = 5;
	}
	
	public void inicializa(int andaresTotal, int capacidade) {
		this.andaresTotal = andaresTotal;
		this.capacidade = capacidade;	
		this.setAndarAtual(0);
		this.setPessoasPresentes(0);	
		System.out.println("Total de Andares: "+andaresTotal+" Capacidade: "+capacidade);
		System.out.println("Andar Atual:" +this.getAndarAtual());
		System.out.println("Pessoas no elevador:" + this.getPessoasPresentes());
	}
	
	public void entra() {
		if(this.getPessoasPresentes() < this.getCapacidade()) {
				pessoasPresentes++;
			System.out.println("Total de Pessoas: "+this.getPessoasPresentes());
		}else {
			System.out.println("Elevador cheio. \nTotal de Pessoas: "+this.getPessoasPresentes());
		}
			
	}
	
	public void sobe() {
		if(this.getAndarAtual()<this.getAndaresTotal()) {
				andarAtual++;
			System.out.println("Subindo");
		}else {
			System.out.println("N�o � poss�vel subir. Estamos no andar "+this.getAndarAtual());
		}
			
	}
	
	public void desce() {
		if(this.getAndarAtual()>0) {
				andarAtual--;
			System.out.println("Descendo");
		}else {
			System.out.println("N�o � poss�vel descer. Estamos no andar "+this.getAndarAtual());
		}
	}
	
	public void sai() {
		if(this.getPessoasPresentes()>0) {
				pessoasPresentes--;
			System.out.println("Pessoa saindo. Total agora: "+this.getPessoasPresentes());
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndaresTotal() {
		return andaresTotal;
	}

	public void setAndaresTotal(int andaresTotal) {
		this.andaresTotal = andaresTotal;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
	
	
}


/*Crie uma classe denominada Elevador para armazenar as informa��es de um elevador
dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares
no pr�dio (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o
presentes nele. A classe deve tamb�m disponibilizar os seguintes m�todos:
Inicializa : que deve receber como par�metros a capacidade do elevador e o total de
andares no pr�dio (os elevadores sempre come�am no t�rreo e vazio);
Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver
espa�o);
Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
dentro dele);
Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
Encapsular todos os atributos da classe (criar os m�todos set e get).
*/