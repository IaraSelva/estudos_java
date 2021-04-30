package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Colecoes {

	public static void main(String[] args) {

		Collection <String> nomes = new ArrayList();
		
		nomes.add("Maria");
		nomes.add("Joana");
		nomes.add("Selma");
		nomes.add("Sérgio");
		
		nomes.remove("Selma");
		
		System.out.println("Contém o nome Maria? "+nomes.contains("Maria"));

		
		if(nomes.isEmpty()) {
			System.out.println("Lista vazia");
		}
		else {
		System.out.println("Lista de nomes: "+nomes);
		}
		
		//nomes.clear(); 
		
		Collection <String> nomes2 = Arrays.asList("José","Josimara");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}

}
