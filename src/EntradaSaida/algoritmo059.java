/*******************************************************
 * Criar um algoritmo que leia o valor de um depósito  *
 * e o valor da taxa de juros. Calcular e imprimir o v *
 * alor do rendimento e o valor total depois do ren di *
 * mento.                                              *
 *******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo059
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double deposito, taxa, valor, total;

        System.out.print( "Entre com o depósito: " );
        deposito = digite.nextDouble();
        System.out.print( "Entre com a taxa de juros: " );
        taxa = digite.nextDouble();

        valor = (deposito * (taxa / 100));
        total = (deposito + valor);

        System.out.println( "Rendimentos: " +valor+ "\nTotal: " +total );
    }
}
