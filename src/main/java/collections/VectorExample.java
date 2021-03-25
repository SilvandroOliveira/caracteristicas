package collections;

import java.util.List;
import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Futsal");
        esportes.add("Handebol");
        esportes.add("Basquete");

        esportes.set(2, "Mountain Bike");
        esportes.remove(2);
        esportes.remove("Basquete");

        System.out.println(esportes.get(0));

        for(String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
