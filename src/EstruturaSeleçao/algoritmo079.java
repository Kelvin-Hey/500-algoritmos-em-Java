/**********************************************************************
 * Entrar com um número e imprimir uma das mensagens: é multiplo de 3 *
 * ou não é oumultiplo de 3                                           *
 **********************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo079
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int numero;
        System.out.print( "Digite um número: " );
        numero = digite.nextInt();

        if ( numero % 3 == 0 ) {
            System.out.println( "Multiplo de 3" );
        } else {
            System.out.println( "Não é multiplo de 3" );
        }
    }
}
