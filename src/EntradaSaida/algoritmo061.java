/**************************************************************
 * Para vários tributos, a base de cálculo é o salário mínimo.*
 * Fazer um algoritmo que leia o valor do salário mínimo e o  *
 * valor do salário de uma pessoa. Calcular e impri- mir      *
 * quantos salários mínimos ela ganha                         *
 **************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo061
{
    public static void main ( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double salmin, salpe, num;

        System.out.print( "Entre com o salário Mínimo: " );
        salmin = digite.nextDouble();
        System.out.print( "Entre com o salário da pesooa: " );
        salpe = digite.nextDouble();

        num = (salpe / salmin);
    }
}
