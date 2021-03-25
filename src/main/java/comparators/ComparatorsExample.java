package comparators;

import java.util.*;

public class ComparatorsExample
{
    public static void main(String[] args)
    {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Silvandro", 29));
        estudantes.add(new Estudante("Daniely", 28));
        estudantes.add(new Estudante("Dimas", 32));
        estudantes.add(new Estudante("Alessandro", 15));

        System.out.println("Ordem de inserção:");
        System.out.println(estudantes);

        //Interface Comparator eh funcional e permite uso de sintaxe lambda
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordem natural:");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem reversa:");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("Ordem natural - method reference:");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Ordem reversa - method reference:");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("Ordem natural - interface Comparable:");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReservaComparator());
        System.out.println("Ordem reversa - interface Comparator:");
        System.out.println(estudantes);
    }
}
