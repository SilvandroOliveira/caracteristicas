package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample
{
    public static void main(String[] args)
    {
        List<String> nomes = new ArrayList<>();

        nomes.add("Silvandro");
        nomes.add("Daniely");
        nomes.add("Célia");
        nomes.add("Joaquim");
        nomes.add("Rosa");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(3, "Dimas");
        System.out.println(nomes);
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("Joaquim");
        System.out.println(nomes);
        String nome = nomes.get(2);
        System.out.println(nome);
        int tamanho = nomes.size();
        System.out.println(tamanho);
        for (String item : nomes) {
            System.out.println("Nome: " + item);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("-> " + iterator.next());
        }

        nomes.clear();
        System.out.println(nomes);
        int posicao = nomes.indexOf("Célia"); // -1 para quando nao existe
        System.out.println(posicao);
        var vazia = nomes.isEmpty();
        System.out.println(vazia);
    }
}
