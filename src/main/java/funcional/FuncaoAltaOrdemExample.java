package funcional;

public class FuncaoAltaOrdemExample
{
    public static void main(String[] args)
    {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULT = (a, b) -> a * b;

        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(DIVISAO, 4, 2));
        System.out.println(executarOperacao(MULT, 7, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b)
    {
        return calculo.calculo(a, b);
    }

    public int soma(int a, int b)
    {
        return a + b;
    }
}

@FunctionalInterface
interface Calculo
{
    public int calculo(int a, int b);
}