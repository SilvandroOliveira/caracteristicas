package funcional;

import java.util.function.Function;

public class FunctionExample
{
    public static void main(String[] args)
    {
        Function<String, String> nomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> stringInteiroDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(nomeContrario.apply("Silvandro"));
        System.out.println(stringInteiroDobro.apply("20"));
    }
}
