/******************************************************
 * Entrar com a razão de uma PA e o valor do 1 termo  *
 * Calcular e imprimir o 10 termo da série.           *
 ******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo047
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int dec, raz, termo;

        System.out.println( "Entrar com 1 termo: " );
        termo = digite.nextInt();
        System.out.println( "Entrar com a razão: " );
        raz = digite.nextInt();

        dec = (termo + (9 * raz));

        System.out.println( "O 10 termo desta P.A. e: " + dec );
    }
}
