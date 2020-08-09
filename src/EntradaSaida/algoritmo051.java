/***********************************************************
 * Ler uma temperatura em graus centígrados e apresenta-la *
 * convertida em graus Fahrenheit. A fórmula de conversão  *
 * é F = (9.C + 160) / 5 onde F é a temperatura em Fahren- *
 * heit e C é a temperatura em centígrados                 *
 ***********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo051
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double f, c;

        System.out.print( "Digite o valor da temperatura em graus " +
                "centigrados: " );
        c = digite.nextDouble();

        f = ((9 * c + 160) / 5);

        System.out.println( "O valor da temperatura em graus fahrenheit " +
                "é " + f );
    }
}
