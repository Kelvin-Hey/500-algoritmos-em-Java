/**************************************************************
 * Entrar com um número e informar se ele é divisível por 1O, *
 * por 5, por 2 ou se não é divisível por nenhum destes.      *
 **************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo082
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int numero;

        System.out.print( "Digite um número: " );
        numero = digite.nextInt();

        if ( numero % 10 == 0 ) {
            System.out.println( "múltiplo de 10" );
        } else {

            if ( numero % 2 == 0 ) {
                System.out.println( "múltiplo de 2" );
            } else {

                if ( numero % 5 == 0 ) {
                    System.out.println( "múltiplo de 5" );
                } else {
                    System.out.println( "não é múltiplo de 5 nem de 2" );
                }
            }
        }
    }
}