/*****************************************************
 * Entrar com os lados a, b, c de um paralélepipedo. *
 * Calcular e imprimir a diagonal.                   *
 *****************************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo040
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b, c, diagonal;

        System.out.println( "Entre com a base: " );
        a = digite.nextDouble();
        System.out.println( "Entre com a altura: " );
        b = digite.nextDouble();

        System.out.println( "Entre com a profundidade: " );
        c = digite.nextDouble();

        diagonal = Math.sqrt( (a * a) + (b * b) + (c * c) );

        System.out.println( "\ndiagonal : " + diagonal );
    }
}
