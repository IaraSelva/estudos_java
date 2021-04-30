package poo;

import java.util.Random;

public class Luta {
	

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador L1, Lutador L2) {
		if(L1.getCategoria().equals(L2.getCategoria())&&L1!=L2) {
			this.setAprovada(true);
			this.desafiado=L1;
			this.desafiante=L2;
			System.out.println("Luta aprovada!\n"+desafiado.getNome()+" X "+desafiante.getNome());
		}else {		
		if(L1.getCategoria() != L2.getCategoria()) {
				System.out.println("Luta não aprovada"+
								"\nLutador 1 peso "+L1.getCategoria()+
								"\nLutador 2 peso "+L2.getCategoria());
		} else {
		if(L1==L2) {
			System.out.println("Luta não aprovada"+
							"\nLutador 1: "+L1.getNome()+
							"\nLutador 2: "+L2.getNome());
		}
		else {
			this.setAprovada(false);
			this.desafiado=null;
			this.desafiante=null;
		}
	}
	}
}
	
	
	public void lutar() {
		if(this.getAprovada()) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
		System.out.println("Lutar!!!");
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			//int vencedor = (int) Math.random()*3;
			switch(vencedor) {
			case 0: desafiado.ganharLuta();
					desafiante.perderLuta();
					System.out.println("Vencedor: "+desafiado.getNome());
					break;
			case 1: desafiante.ganharLuta();
					desafiado.perderLuta();
					System.out.println("Vencedor: "+desafiante.getNome());
					break;
			case 2: desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println("Empatou.");
					break;
			}
		}else {
			System.out.println("Luta não pode acontecer.");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
