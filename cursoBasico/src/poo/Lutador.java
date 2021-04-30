package poo;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;


	public Lutador(String n, String nac, int id, double a, double p , int v, int d, int e) {
		
		this.nome = n;
		this.nacionalidade = nac;
		this.idade = id;
		this.altura = a;
		this.setPeso(p);
		this.vitorias = v;
		this.derrotas = d;
		this.empates = e;
	}
	
	public void apresentar() {
		System.out.println("Apresentando: "+this.getNome()+("\nNacionalidade: "+this.getNacionalidade()+"\n"+this.getIdade()+" anos\n"+this.getAltura()+" de altura e "+this.getPeso()+" kg. \n"+"Categoria: "+this.getCategoria()+"\n"+this.getVitorias()+" vitórias, "+this.getEmpates()+" empates e "+this.getDerrotas()+" derrotas!"));
		}
	
	public void status() {
		System.out.println(this.getNome()+" é um peso "+this.getCategoria()+", venceu "+this.getVitorias()+" vezes, "+this.getEmpates()+" empates e "+this.getDerrotas()+" derrotas!");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
		
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
		
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1 );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double p) {
		this.peso = p;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
			if(this.peso<52.2) {
			this.categoria="Ínvalido";
		}else {
			if(this.peso<=70.3) {
			this.categoria="Leve";
		}else {
			if(this.peso<=83.9) {
			this.categoria="Médio";
		}else {
			if(this.peso<=120.2) {
				this.categoria="Pesado";
			}else {
				this.categoria="Inválido";
			}
		}
		
	}
}
}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	

}
