/*******************************************************************
 * Construir um algoritmo que leia dois valores numéricos inteiros *
 * e efetue a adição; caso o resultado seja maior que 10,          *
 * apresentá-lo.                                                   *
 *******************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo076
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num1, num2, soma;

        System.out.print( "Digite o 1̣̣̣̣̣̣̣̣° número: " );
        num1 = digite.nextInt();
        System.out.print( "Digite o 2° número: " );
        num2 = digite.nextInt();

        soma = num1 + num2;
        
    }
}
