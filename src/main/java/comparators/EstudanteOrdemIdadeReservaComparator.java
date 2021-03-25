package comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReservaComparator implements Comparator<Estudante>
{
    @Override
    public int compare(Estudante e1, Estudante e2)
    {
        return e2.getIdade() - e1.getIdade();
    }
}
