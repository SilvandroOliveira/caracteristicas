package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<String, Integer> campeosMundiais = new HashMap<>();

        campeosMundiais.put("Brasil", 5);
        campeosMundiais.put("Alemanha", 4);
        campeosMundiais.put("Itália", 4);
        campeosMundiais.put("Uruguai", 2);
        campeosMundiais.put("Argentina", 2);
        campeosMundiais.put("França", 2);
        campeosMundiais.put("Inglaterra", 1);
        campeosMundiais.put("Espanha", 1);

        System.out.println(campeosMundiais.entrySet());

        System.exit(1);

        System.out.println(campeosMundiais);
        campeosMundiais.put("Brasil", 6);
        System.out.println(campeosMundiais);
        System.out.println(campeosMundiais.get("Argentina"));

        for (Map.Entry<String, Integer> entry: campeosMundiais.entrySet() ) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (String key: campeosMundiais.keySet()) {
            System.out.println(key + " -> " + campeosMundiais.get(key));
        }
    }
}
