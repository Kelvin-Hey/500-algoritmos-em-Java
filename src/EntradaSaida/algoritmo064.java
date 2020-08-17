/***************************************************
 * Ler dois números reais e imprimir o quadrodo da *
 * diferença do primeiro valor pelo segundo e a    *
 * diferença dos quadrados pelo segundo            *
 ***************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo064
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b, d, q;

        System.out.print( "Digite o primeiro número: " );
        a = digite.nextDouble();
        System.out.print( "Digite o segundo número: " );
        b = digite.nextDouble();

        d = Math.pow((a -b), 2);

        a = Math.sqrt(2);
        b = Math.sqrt(2);

        q = Math.pow(a, 2) - Math.pow(b, 2);

        System.out.println( "O quadrado da diferença = " +d );
        System.out.println( "Diferença dos quadrados = " +q );
    }
}
