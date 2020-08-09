/**************************************************
 * Entrar com a base e a altura de um retângulo e *
 * imprimir a seguinte saída:                     *
 * perímetro:                                     *
 * area:                                          *
 * diagonal :                                     *
 **************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo037
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double area, perimetro, base, altura, diagonal;

        System.out.print( "Digite a base: " );
        base = digite.nextDouble();
        System.out.print( "Digite uma altura: " );
        altura = digite.nextDouble();

        perimetro = (2 * (base + altura));
        area = (base * altura);;

        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println( "Perímetro = " + perimetro );
        System.out.println( "Área = " + area );
        System.out.println( "Diagonal " + diagonal );
    }
}
