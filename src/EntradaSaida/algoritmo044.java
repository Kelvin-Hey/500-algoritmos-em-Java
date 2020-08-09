/*************************************************
 * Entrar com as notas da PR1 e PR2 e imprimir a *
 * média final.                                  *
 * truncado:                                     *
 * arredonda:                                    *
 *************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo044
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double pr1, pr2, mf;

        System.out.print( "Digite pr1: " );
        pr1 = digite.nextDouble();
        System.out.print( "Digite pr2: " );
        pr2 = digite.nextDouble();

        mf = (pr1 + pr2) / 2;

        System.out.println( "Média truncada = " + (int) (mf + 0.1 ) );
        System.out.println( "Média arredondada = " + (int) (mf + 0.001) );
    }
}
