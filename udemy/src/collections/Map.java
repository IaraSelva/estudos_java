package collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        java.util.Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberta");
        usuarios.put(2, "Marcela");
        usuarios.put(3, "Maria");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.get(1));

        for (int chave:
             usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String usuario:
                usuarios.values()) {
            System.out.println(usuario);
        }

        for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + registro.getValue());
        }
    }

}
