/*****************************************************************
 * Entrar com quatro números e imprimir a média ponderada,       *
 * sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.     *
 * ***************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo028
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b, c, d, mp;

        System.out.print( "Entre com o primeiro número: " );
        a = digite.nextDouble();
        System.out.print( "Entre com o segundo número: " );
        b = digite.nextDouble();
        System.out.print( "Entre com o terceiro número: " );
        c = digite.nextDouble();
        System.out.print( "Entre com o quarto número: " );
        d = digite.nextDouble();

        mp = ((a * 1 + b * 2 + c * 3 + d * 4) / 10);

        System.out.println( "\nMédia ponderada: " + mp + "\n" );
    }
}
