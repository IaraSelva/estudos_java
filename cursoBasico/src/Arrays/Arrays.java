package Arrays;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 27;
		temperaturas[2] = 32.4;
		temperaturas[3] = 28.5;
		temperaturas[4] = 27;
		
		System.out.println("A temperatura do dia 3 foi: " +
		temperaturas[2]);
		
		System.out.println("Tamanho do Array: " 
				+ temperaturas.length);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("A temperatura do dia " +(i+1) +
					" foi: " + temperaturas[i]);	
			}
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
	}
}
