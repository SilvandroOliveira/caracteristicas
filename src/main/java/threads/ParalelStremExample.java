package threads;

import java.util.stream.IntStream;

public class ParalelStremExample
{
    public static void main(String[] args)
    {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Paralelo: " + (fim - inicio));
    }


    public static long fatorial(long num)
    {
        int fat = 0;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}
