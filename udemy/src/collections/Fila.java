package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Maria");
        fila.offer("Joao");

        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.element());
        fila.clear();
        System.out.println(fila.peek());
        System.out.println(fila.size());

        //System.out.println(fila.element());



    }
}
