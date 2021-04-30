package poo;

import java.util.HashSet;
import java.util.Set;


public class TestaAgenda {
	public static void main (String [] args) {
	
	
	Set<Agenda> contatinhos = new HashSet<Agenda>();
	Agenda A = new Agenda("Amanda",5,7);
	Agenda B = new Agenda("João",2,5);
	Agenda C = new Agenda("Mariana",3,8);
	Agenda D = new Agenda("Marcos",0,4.5);
	
	
	contatinhos.add(A);
	contatinhos.add(B);
	contatinhos.add(C);
	contatinhos.add(D);
	
	System.out.println(contatinhos);
	
	contatinhos.remove(A);
	System.out.println(contatinhos);
	
	}
	
}
