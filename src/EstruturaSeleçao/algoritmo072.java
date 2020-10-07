/****************************************************************
 * Ler um número e imprimir se ele é positivo, negativo ou nulo *
 ****************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo072
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double num;

        System.out.print( "Digite um número: " );
        num = digite.nextDouble();

        if ( num > 0 ) {
            System.out.println( "Positivo" );
        } else if ( num < 0 ) {
            System.out.println( "Negativo" );
        } else {
            System.out.println( "Nulo" );
        }

        
    }
}
