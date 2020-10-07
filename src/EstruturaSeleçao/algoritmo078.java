/*******************************************************************
 * Entrar com um número e imprimir a raiz quadrada do número caso  *
 * ele seja positivo e o quadrado do número caso ele seja negativo *
 *******************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo078
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double numero;

        System.out.print( "Digite um número: " );
        numero = digite.nextDouble();

        if ( numero > 0 ) {
            System.out.println( "Raiz: " +Math.sqrt(numero) );
        } else if ( numero < 0 ) {
            System.out.println( "Quadrado: " +(numero * numero) );
        }
    }
}
