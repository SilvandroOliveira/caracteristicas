package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample
{
    public static void main(String[] args)
    {
        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);
        System.out.println(capitais.firstKey());
        System.out.println(capitais.lastKey());
        System.out.println(capitais.lowerKey("SC"));
        System.out.println(capitais.higherKey("SC"));
        System.out.println(capitais.firstEntry().getKey() + " -> " + capitais.firstEntry().getValue());
        System.out.println(capitais.lowerEntry("SC").getKey() + " -> " + capitais.lowerEntry("SC").getValue());
        System.out.println(capitais.higherEntry("SC").getKey() + " -> " + capitais.higherEntry("SC").getValue());
        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + " -> " + firstEntry.getValue());
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + " -> " + lastEntry.getValue());
    }
}
