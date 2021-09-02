package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrdenado {

    public static void main(String[] args) {

        Set<String> lista = new TreeSet<>();

        lista.add("Jorge");
        lista.add("Marilia");
        lista.add("Sandra");

        for (String candidato:
             lista) {
           System.out.println(candidato);
        }
    }
}
