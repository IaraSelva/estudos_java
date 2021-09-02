package collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Marcelo"));
        usuarios.add(new Usuario("JP"));
        usuarios.add(new Usuario("PH"));
        usuarios.remove(1);

        for (Usuario u:
             usuarios) {
            System.out.println(u.nome);
        }
    }
}
