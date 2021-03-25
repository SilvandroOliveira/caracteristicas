package funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteracoesExample
{
    public static void main(String[] args)
    {
        String[] nomes = {"Silvandro", "Daniely", "Célia", "Rosa", "Joaquim"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirDobro(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes)
    {
        String imprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Rosa")) {
                imprimir += " " + nomes[i];
            }
        }

        System.out.println("Nomes do for: " + imprimir);

        String imprimirStrem = Stream.of(nomes)
                .filter(nome -> nome.equals("Rosa"))
                .collect(Collectors.joining());

        System.out.println("Nomes do stream: " + imprimirStrem);
    }

    public static void imprimirTodosNomes(String... nomes)
    {
        for (String nome: nomes) {
            System.out.println("Imprimir pelo for: " + nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimir pelo forEach" + nome));
    }

    public static void imprimirDobro(Integer... numeros)
    {
        for (Integer numero: numeros) {
            System.out.println(numero * 2);
        }

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
