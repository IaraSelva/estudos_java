package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.cor = "preto";
		c1.modelo = "fusca";
		c1.velAtual = 30;
		c1.velMax = 100;
		
		c1.liga();
		c1.acelera(50);
		c1.pegaMarcha();		
	}

}
