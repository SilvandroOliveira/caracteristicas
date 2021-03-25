package collections;

import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);
        System.out.println(capitais.first());
        System.out.println(capitais.lower("Florianópolis"));
        System.out.println(capitais.higher("Florianópolis"));
        System.out.println(capitais.pollFirst());
        System.out.println(capitais.pollLast());
    }
}
