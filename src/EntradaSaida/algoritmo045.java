/****************************************************
 * Entrar com os valores para xnum1, xnum2, e xnum3 *
 * e imprimir o valor x, sabendo-se que:            *
 * X = xnum1 + (xnum2 / xnum3 + xnum1) +            *
 * 2(xnum1 - xnum2) + log de 64 na base 2           *
 ****************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo045
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double xnum1, xnum2, xnum3, x;

        System.out.println( "Entrar com o 1 valor: " );
        xnum1 = digite.nextDouble();
        System.out.println( "Entrar com o 2 valor: " );
        xnum2 = digite.nextDouble();
        System.out.println( "Entrar com o 3 valor: " );
        xnum3 = digite.nextDouble();

        x = ((xnum1 + xnum2) / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) +
                (Math.log(64) / Math.log(2)) );

        System.out.println( "X = " + x );
    }
}
