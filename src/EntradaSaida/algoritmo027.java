/*****************************************************************
 * Entrar com dois números inteiros e imprimir a seguinte saída: *
 * dividendo:                                                    *
 * divisor:                                                      *
 * quociente:                                                    *
 * resto:                                                        *
 *****************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo027
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int quoc, rest, val1, val2;

        System.out.print( "\nEntre com o dividendo: " );
        val1 = digite.nextInt();
        System.out.print( "\nEntre com o divisor: " );
        val2 = digite.nextInt();

        quoc = (val1 / val2);
        rest = (val1 % val2);
        System.out.println();

        System.out.println( "dividendo: " + val1 );
        System.out.println( "divisor: " + val2 );
        System.out.println( "quociente: " + quoc );
        System.out.println( "resto: " + rest );
        System.out.println();
    }
}
