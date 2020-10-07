/********************************************************************
 * Entrar com um número e informar se ele é ou não divisível por 5. *
 ********************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo080
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int numero;
        System.out.print( "Entre com um número: " );
        numero = digite.nextInt();

        if ( numero % 5 == 0 ) {
            System.out.println( "Número divisivel por 5" );
        } else {
            System.out.println( "Número não divisivel por 5" );
        }
    }
}
