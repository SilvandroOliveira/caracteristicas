package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample
{
    public static void main(String[] args)
    {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Silvandro", 29);
        estudantes.put("Daniely", 27);
        estudantes.put("Célia", 69);
        estudantes.put("Rosa", 49);
        estudantes.put("Joaquim", 57);

        System.out.println(estudantes);
    }
}
