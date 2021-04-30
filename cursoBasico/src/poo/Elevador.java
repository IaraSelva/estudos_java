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
			System.out.println("Não é possível subir. Estamos no andar "+this.getAndarAtual());
		}
			
	}
	
	public void desce() {
		if(this.getAndarAtual()>0) {
				andarAtual--;
			System.out.println("Descendo");
		}else {
			System.out.println("Não é possível descer. Estamos no andar "+this.getAndarAtual());
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


/*Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).
*/