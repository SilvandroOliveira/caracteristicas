package funcional;

import java.util.HashMap;
import java.util.Map;

public class MemoizationExample
{
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args)
    {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("FATORIAL 2 " + (F - I));
    }


    public static Integer fatorialComMemoization(Integer valor)
    {
        if (valor == 1) {
            return valor;
        } else {
            if (MAPA_FATORIAL.containsKey(valor)) {
                return MAPA_FATORIAL.get(valor);
            } else {
                Integer resultado = valor * fatorialComMemoization(valor - 1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}
