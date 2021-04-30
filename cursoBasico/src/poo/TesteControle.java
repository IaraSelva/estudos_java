package poo;

public class TesteControle {
	public static void main (String[] args) {
		
		ControleRemoto control = new ControleRemoto();
		control.ligar();
		control.abrirMenu();
		control.maisVolume();
		control.ligarMudo();
		control.desligarMudo();
		control.fecharMenu();
		control.play();
		control.pause();
		
	}

}
