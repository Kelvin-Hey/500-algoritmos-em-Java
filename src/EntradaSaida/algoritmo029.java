/********************************************************
 * Entrar com um ângulo em graus e imprimir: seno,      *
 * co-seno, tangente, secante, co-secante e co-tangente *
 * deste ângulo.                                        *
 * ******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo029
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double angulo,rang;
        double pi = 3.14;

        System.out.print( "\nDigite um angulo em graus: " );
        angulo = digite.nextDouble();

        rang = (angulo * pi / 180);

        System.out.println( "\nseno: " + Math.sin(rang) );
        System.out.println( "\nco-seno: " + Math.cos(rang) );
        System.out.println( "\ntangente : " + Math.tan(rang) );
        System.out.println( "\nco-secante: " + (1 / Math.sin(rang)) );
        System.out.println( "\nsecante: " + (1 / Math.cos(rang)) );
        System.out.println( "\ncotangente: " + (1 / Math.tan(rang) ));
        System.out.println();
    }
}