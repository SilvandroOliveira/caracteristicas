package funcional;

import java.util.function.Predicate;

public class PrecidateExample
{
    public static void main(String[] args)
    {
        Predicate<String> vazio = valor -> valor.isEmpty();
        System.out.println(vazio.test(""));
        System.out.println(vazio.test("Silvandro"));
    }
}
