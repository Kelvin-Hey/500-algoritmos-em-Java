/***********************************************************************
 * Entrar com um número e imprimir o logaritmo desse número na base 10 *
 ***********************************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo030
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double num, logaritmo;

        System.out.print( "Entre com o logaritmando: " );
        num = digite.nextDouble();

        logaritmo = Math.log(num) / Math.log(10);

        System.out.println( "\nlogaritmo: " + logaritmo );
    }
}
