package Collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main (String[] args) {
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		Aluno A = new Aluno("Amanda","Java",7);
		Aluno B = new Aluno("João", "Phyton",5);
		Aluno C = new Aluno("Mariana","Java",8);
		Aluno D = new Aluno("Marcos","Sistemas",4.5);
		
		alunos.add(A);
		alunos.add(B);
		alunos.add(C);
		alunos.add(D);
		
		System.out.println(alunos);
		
	}
}
