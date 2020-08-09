/*****************************************************
 * Entrar com os valores dos catetos de um triângulo *
 * retângulo e imprimir a hipotenusa                 *
 *****************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo046
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b, c;

        System.out.print( "Entrar com o 1 cateto: " );
        b = digite.nextDouble();
        System.out.print( "Entrar com o 2 cateto: " );
        c = digite.nextDouble();

        a = Math.sqrt( (b * b) + (c * c) );

        System.out.println( "A hipotenusa é: " + a );
    }
}
