/************************************************************
 * Efutuar o cálculo de uma prestação em atraso, utilizando *
 * a seguinte fórmula:                                      *
 * prestação = valor + (valor * (taxa / 100) * tempo)       *
 ************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo054
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double prest, valor, taxa;
        int tempo;

        System.out.print( "Digite o valor da prestação: " );
        valor = digite.nextDouble();
        System.out.print( "Digite a taxa: " );
        taxa = digite.nextDouble();
        System.out.print( "Digite o tempo(número de meses): " );
        tempo = digite.nextInt();

        prest = (valor + (valor * (taxa / 100) * tempo));

        System.out.println( "O valor da prestação em atraso é " + prest );
    }
}
