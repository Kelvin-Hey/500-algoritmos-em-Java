/************************************************
 * Entrar com o lado de um quadrado e imprimir: *
 * perímetro:                                   *
 * área:                                        *
 * diagonal:                                    *
 ************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo039
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double lado, perimetro, area, diagonal;

        System.out.print( "Digite o lado do quadrado: " );
        lado = digite.nextDouble();

        perimetro = (4 * lado);
        area = (lado * lado);
        diagonal = (lado * Math.sqrt(2));

        System.out.println( "\nperímetro: " + perimetro );
        System.out.println( "área: " + area );
        System.out.println( "diagonal: " + diagonal + "\n" );
    }
}
