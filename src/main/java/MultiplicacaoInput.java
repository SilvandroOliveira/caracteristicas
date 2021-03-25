import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MultiplicacaoInput
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int valorA = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(reader.readLine());
        int valorB = Integer.parseInt(token.nextToken());

        int total = valorA * valorB;
        System.out.println("Resultado = " + total);
    }
}