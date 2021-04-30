package poo;

public class TestaElevador {

	public static void main(String[] args) {

		Elevador eleva = new Elevador();
		
		eleva.inicializa(10, 8);
		eleva.entra();
		eleva.sobe();
		eleva.desce();
		eleva.sai();
	}

}
