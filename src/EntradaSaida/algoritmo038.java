/*************************************
 * Entrar com o raio de um círculo e *
 * imprimir a seguinte saída:        *
 * perímetro:                        *
 * área:                             *
 *************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo038
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double raio, perimetro, area;
        double pi = 3.14;

        System.out.print( "Digite o raio: " );
        raio = digite.nextDouble();

        perimetro = (2 * pi * raio);
        area = ((raio * raio) * pi);

        System.out.println( "\nPerímetro: " + perimetro );
        System.out.println( "Área: " + area + "\n" );

    }
}
