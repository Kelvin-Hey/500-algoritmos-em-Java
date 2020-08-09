/***************************************************
 * Efetuar a calculo da quantidade de combústivel  *
 * gasto em uma viagem, sabendo-se que o carro faz *
 * 12 km com um litro. Deverão ser fornecidos o    *
 * gasto na viagem e a velocidade média            *
 *                                                 *
 * Utilizar as seguintes fórmulas:                 *
 * distância = tempo x velocidade                  *
 * litros usados = distância / 12                  *
 *                                                 *
 * O algoritmo deverá apresentar os valores da     *
 * velocidade média, tempo gasto na viagem,        *
 * distância percorrida e a quantidade de litros   *
 * utilizados na viagem                            *
 ***************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo053
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double tempo, vel, dist, litros;

        System.out.println( "Digite o tempo gasto: " );
        tempo = digite.nextDouble();
        System.out.print( "Digite a velocidade média: " );
        vel = digite.nextDouble();

        dist = (tempo * vel);
        litros = (dist / 12);

        System.out.println( "Velocidade = " +vel+ "\nTempo = " +tempo+
                "\nDistância = " +dist+ "\nLitros = " +litros );

    }
}
