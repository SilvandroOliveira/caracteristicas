package funcional;

import java.util.function.Consumer;

public class ConsumerExample
{
    public static void main(String[] args)
    {
        Consumer<String> imprimirFrase = System.out::println;

        //Sintaxe lambda
        Consumer<String> imprimirOutraFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World!");
    }
}
