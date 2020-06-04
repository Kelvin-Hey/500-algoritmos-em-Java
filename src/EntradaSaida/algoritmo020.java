/*****************************
 * Ler dois números inteiros *
 * e imprimi-los             *
 *****************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo020
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num1, num2;

        System.out.print( "\nEntre com um número: " );
        num1 = digite.nextInt();
        System.out.print( "\nEntre com outro número: " );
        num2 = digite.nextInt();

        System.out.print( "\nnúmero 1: " + num1 );
        System.out.print( "\nnúmero 2: " + num2 );
        System.out.println();
    }
}
