/***************************************************
 * Ler um número, e imprimir se ele é par ou ímpar *
 ***************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo071
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int a;

        System.out.print( "Digite um núemero: " );
        a = digite.nextInt();

        if ( a % 2 == 0 ) {
            System.out.println( "Par" );
        } else {
            System.out.println( "Ímpar" );
        }


    }
}
