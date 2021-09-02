package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSet {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);
        System.out.println(conjunto.size());

        conjunto.add(true);
        conjunto.add("Teste");
        System.out.println(conjunto);
        System.out.println(conjunto.size());

        conjunto.remove(1);
        System.out.println(conjunto);

        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);
        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
