package poo;

public class MinhaCalculadora {
	
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtracao(int num1, int num2) {
		return num2 - num1;
	}
	
	public int soma(int [] vetorInt) {
		
		int total = 0;
		
		for(int i=0; i<vetorInt.length; i++) {
			total = vetorInt[i];
		}
		return total;

	}

}
