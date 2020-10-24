/*******************************************************
 * Ler um número inteiro de 4 casas e imprimir se é ou *
 *  não múltiplo de quatro o número formado pelos alga *
 * rismos que estão nas casas das unidades de milhar e *
 *  das centenas                                       *
 *******************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo085
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num;
        int c;

        System.out.printf( "Insira o número de 4 algarismos: " );
        num = digite.nextInt();

        c = (num / 100);

        if ( c % 4 == 0 ) {
            System.out.println( "O número múltiplo de 4: " + c );
        } else {
            System.out.println( "O número não é múltiplo de 4: " + c );
        }
    }
}
