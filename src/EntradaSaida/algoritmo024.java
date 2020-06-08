/**************************************************
 * Ler dois números inteiros e imprimir o produto *
 **************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo024
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num1, num2, prod;

        System.out.print( "Entre com um número: " );
        num1 = digite.nextInt();
        System.out.print( "\nEntre com um número: " );
        num2 = digite.nextInt();

        prod = (num1 * num2);
        System.out.printf( "\nProduto: %d", prod, "\n" );
    }
}
