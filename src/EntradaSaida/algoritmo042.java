/**********************************************
 * Criar um algoritmo que calcule e imprima a *
 * área de um losango.                        *
 **********************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo042
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double diagonalMaior, diagonalMenor, area;

        System.out.print( "Insira a medida da deiagonal menor: " );
        diagonalMenor = digite.nextDouble();
        System.out.println( "Insira a medida da diagonal maior: " );
        diagonalMaior = digite.nextDouble();

        area = ((diagonalMaior * diagonalMenor) / 2);

        System.out.println( "área = " + area );
    }
}
