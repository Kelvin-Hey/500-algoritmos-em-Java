/*******************************************************
 *  Ler um número inteiro de 3 casas decimais e imprim *
 * ir se o algarismo da casa das                       *
 *******************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo084
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num;
        int c;

        System.out.printf( "Insira um número de 3 algarismos: " );
        num = digite.nextInt();

        c = (num / 100);

        if( c % 2 == 0 ) {
            System.out.println( "o algarismo das centenas e par: " + c );
        } else {
            System.out.println( "o algarismo das centenas e ímpar: " + c );
        }
    }

}
