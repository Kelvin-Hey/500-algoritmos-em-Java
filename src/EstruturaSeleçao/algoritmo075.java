/************************************************************
 * Entrar com um número e imprimi-lo caso seja maior que 20 *
 ************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo075
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double numero;

        System.out.println( "Digite um número: " );
        numero = digite.nextInt();

        if ( numero > 20 ) {
            System.out.println( numero );
        }
    }
}
