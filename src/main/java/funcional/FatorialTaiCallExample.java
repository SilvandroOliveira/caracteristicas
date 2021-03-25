package funcional;

public class FatorialTaiCallExample
{
    public static void main(String[] args)
    {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA(double valor)
    {
        return fatorialTailCall(valor, 1);
    }

    public static double fatorialTailCall(double valor, double numero)
    {
        return valor == 0 ? numero : fatorialTailCall(valor - 1, numero * valor);
    }
}
