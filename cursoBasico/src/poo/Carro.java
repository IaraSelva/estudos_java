package poo;

public class Carro {
	
	public String cor;
	public String modelo;
	double velAtual;
	double velMax;
	
	public void liga() {
		
		System.out.println("Carro ligado.");
	}
	
	public void acelera(double vel) {
		
		double novaVel = this.velAtual + vel;
		this.velAtual = novaVel;
		System.out.println("Velocidade atual: "+this.velAtual);
	}
	
	public int pegaMarcha() {
		if(this.velAtual<0) {
			return -1;
		}
		if(this.velAtual>=0 && this.velAtual<40) {
			return 1;
		}
		if(this.velAtual>=40 && this.velAtual<80) {
			return 2;
		}
		return 3;
	}

}
