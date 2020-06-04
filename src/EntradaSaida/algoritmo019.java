/**************************************
 * Ler um número inteiro e imprimi-lo *
 **************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo019
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num;

        System.out.print( "\nEntre com o número: " );
        num = digite.nextInt();

        System.out.print( "\nnúmero: " + num );
        System.out.println();
    }
}
