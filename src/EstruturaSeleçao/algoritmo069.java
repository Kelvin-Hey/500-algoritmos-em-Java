/*************************************************
 * Ler um número e se ele for maior que 20 então *
 * imprimir a metade desse número.               *
 *************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo069
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double numero, met;

        System.out.print( "Digite um numero: " );
        numero = digite.nextDouble();

        if ( numero > 20 ) {

            met = ( numero / 2 );
            System.out.println( "Metade: " +met );
        }
    }
}
