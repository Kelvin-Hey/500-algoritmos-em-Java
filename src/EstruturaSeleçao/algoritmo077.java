/*******************************************************************
 * Construir um algoritmo que leia dois números e efetue a adição. *
 * Caso o valor somado seja maior que 20, este deverá ser          *
 * apresentado somando-se a ele mais 8;                            *
 * caso o valor somado seja menor ou igual a 20, este deverá ser   *
 * apresentado subtraindo-se 5.                                    *
 *******************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo077
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double num1, num2, soma;

        System.out.print( "Digite o 1° número: " );
        num1 = digite.nextInt();
        System.out.print( "Digite o 2° número: " );
        num2 = digite.nextInt();

        soma = (num1 + num2);

        if ( soma > 20 ) {
            System.out.println( "soma: " +(soma + 8) );
        } else {
            System.out.println( "soma: " +(soma - 5) );
        }
    }
}
