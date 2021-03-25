package collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Silvandro");
        filaBanco.add("Daniely");
        filaBanco.add("Célia");
        filaBanco.add("Rosa");
        filaBanco.add("Joaquim");

        System.out.println(filaBanco);
        String proximoCliente = filaBanco.poll();
        System.out.println(proximoCliente);
        System.out.println(filaBanco);
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        filaBanco.clear();
        try {
            String ultimoCliente = filaBanco.element();
            System.out.println(ultimoCliente);
        } catch (NoSuchElementException e) {
            System.out.println("Erro ao buscar cliente " + e);
        }
        filaBanco.add("Dimas");
        System.out.println(filaBanco);
    }
}
