package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args)
    {
        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(5.8);
        notaAlunos.add(6.2);
        notaAlunos.add(8.4);
        notaAlunos.add(4.3);
        notaAlunos.add(5.6);

        System.out.println(notaAlunos);
        notaAlunos.remove(6.2);
        System.out.println(notaAlunos);
    }
}
