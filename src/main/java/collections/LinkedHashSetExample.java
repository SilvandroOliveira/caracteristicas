package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        Set<Integer> sequencia = new LinkedHashSet<>();

        sequencia.add(6);
        sequencia.add(2);
        sequencia.add(3);
        sequencia.add(4);
        sequencia.add(5);

        System.out.println(sequencia);
        sequencia.remove(3);
        System.out.println(sequencia);
    }
}
