/*******************************************************
 * Criar um algoritmo que leia o numerador e o denomin *
 * ador de uma fração e transformá-lo em um númeor dec *
 * imal                                                *
 *******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo056
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num, denom;

        System.out.print( "Digite o numerador: " );
        num = digite.nextInt();
        System.out.print( "Digite o denominador: " );
        denom = digite.nextInt();

        System.out.println( "Decimal: " +(num / denom) );
    }
}
