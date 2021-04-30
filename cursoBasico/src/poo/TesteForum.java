package poo;

public class TesteForum {
	public static void main(String [] args) {
		
		Participante p1 = new Participante();
		Leitor l = p1;
		Programador pg = p1;
		String java = "JAVA";
		String phyton = "PHYTON";
		pg.pensando(java.toCharArray());
		pg.pensando(phyton.toCharArray());
		
	}

}
