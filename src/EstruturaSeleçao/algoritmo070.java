/**************************************************
 * Ler um número e, se ele for positivo, imprimir *
 * o seu inverso; caso contrário imprimir o valor *
 * obsoleto do número.                            *
 **************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo070
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double numero, inverso, absoluto;

        System.out.print( "Digite um número: " );
        numero = digite.nextDouble();

        if ( numero > 0 ) {

            inverso = (1 / numero);
            System.out.println( "Inverso: " +inverso );

        } else {

            absoluto = (numero * -1);
            System.out.println("Absoluto: " +absoluto );
        }
    }
}
