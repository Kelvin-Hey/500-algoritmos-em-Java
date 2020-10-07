/**********************************************************
 * Entrar com o número e a base em que se deseja calcular *
 * o logaritmo desse núme-ro e imprimi-lo.                *
 **********************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo031
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double num, base, logaritmo;

        System.out.print( "Entre com o logaritmando: " );
        num = digite.nextDouble();
        System.out.print( "Entre com a base: " );
        base = digite.nextDouble();

        logaritmo = (Math.log(num) / Math.log(base));

        System.out.println( "\nO logaritmo de " + num + " na base " +
                            base + " é " + logaritmo );
    }
}
