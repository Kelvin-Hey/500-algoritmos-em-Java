/**********************************************************
 * Uma pessoa resolveu fazer um aplicação em uma poupança *
 * programada. Para calcular o seu rendimento ela deverá  *
 * fornecer o valor constante da aplicação mensal, a taxa *
 * e o número de meses. Sabendo-se que a fórmula usada    *
 * para esse cálculo é:                                   *
 * Valor acumulado = P * ((1 + i)^n - 1) / i              *
 *                                                        *
 * i = taxa | P = aplicação mensal | n = nº de meses      *
 **********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo066
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double valor, i, p;
        int n;

        System.out.print( "Digite o valor da aplicação: " );
        p = digite.nextDouble();
        System.out.print( "Digite o valor da taxa(0 - 1): " );
        i = digite.nextDouble();
        System.out.print( "Digite o número de meses: " );
        n = digite.nextInt();

        valor = p * ((Math.pow( i + 1, n ) - 1));
    }
}
