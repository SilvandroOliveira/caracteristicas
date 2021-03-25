package funcional;

import java.util.function.Supplier;

public class SuppliersExample
{
    public static void main(String[] args)
    {
        Supplier<Pessoa> primeiraPessoa = () -> new Pessoa();

        //Por metodo de referencia
        Supplier<Pessoa> segundaPessoa = Pessoa::new;

        System.out.println(primeiraPessoa.get());
        System.out.println(segundaPessoa.get());
    }
}

class Pessoa
{
    private String nome;
    private Integer idade;

    public Pessoa()
    {
        nome = "Silvandro";
        idade = 29;
    }

    @Override
    public String toString()
    {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
