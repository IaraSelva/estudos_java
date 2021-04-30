package Collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	
	//map n�o utiliza set nem list
	public static void main(String args[]) {
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno A = new Aluno("Amanda","Java",7);
		Aluno B = new Aluno("Jo�o", "Phyton",5);
		Aluno C = new Aluno("Mariana","Java",8);
		Aluno D = new Aluno("Marcos","Sistemas",4.5);
		
		mapa.put("Amanda", A);
		mapa.put("Jo�o", B);
		mapa.put("Mariana", C);
		mapa.put("Marcos", D);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Jo�o"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e:alunos) {
			System.out.println(e);
		}
	}

}
