/*********************************************
 * Crie um algoritmo que calcule e imprima a *
 * área de um triângulo:                     *
 *********************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo041
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b;

        System.out.print( "Entre com a base: " );
        a = digite.nextDouble();
        System.out.print( "Entre com a altura do triângulo: " );
        b = digite.nextDouble();

        System.out.println( "\nÁrea = " + ((a * b) / 2) );
    }
}
