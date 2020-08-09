/*******************************************************
 * Todo restaurante, embora não possa por lei obrigar  *
 * o cliente a pagar, cobra 10% para o garçom. Fazer u *
 * m algoritmo que leia o valor total gasto com despes *
 * as no restaurante e imprima o valor dtotal com a go *
 * rjeta.
 *******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo057
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double cres, cgorj;

        System.out.print( "Entre com o valor da conta: " );
        cres = digite.nextDouble();

        cgorj = (cres * 1.1);

        System.out.printf( "O valor da conta com a gorjeta será: %.2f", cgorj );
    }
}
