package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamExample
{
    public static void main(String[] args)
    {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Silvandro");
        estudantes.add("Daniely");
        estudantes.add("Mariana");

        System.out.println("Contagem: " + estudantes.stream().count());
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter(estudante -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("Retorna os elementos novamente:");
        estudantes.stream().forEach(System.out::println);
        System.out.println("Tem algum elemento com W no nome? " + estudantes.stream().allMatch(estudante -> estudante.contains("W")));
        System.out.println("Tem algum elemento com a minúsculo no nome? " + estudantes.stream().anyMatch(estudante -> estudante.contains("a")));
        System.out.println("Não tem nenhum elemento com a minúsculo no nome? " + estudantes.stream().noneMatch(estudante -> estudante.contains("a")));
        System.out.println("Retorna o primeiro elemento da coleção:");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        System.out.println("Operação encadeada:");
        System.out.println(
                estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())
                //.collect(Collectors.joining())
                //.collect(Collectors.toSet())
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)))
        );
    }
}
