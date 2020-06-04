/*******************************************
 * Entrar com uma data no formato ddmmaaaa *
 * e imprimir dia, mês e ano separados     *
 *******************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo013
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );

        int data, dia, mes, anos;

        System.out.println( "Insira a data no formato ddmmaa: " );
        data = digite.nextInt();

        // 23 03 2023
        dia = data / 10000;
        mes = data % 10000 / 100;
        anos = data % 100;

        System.out.print( "\nDIA: " + dia );
        System.out.print( "\nMÊS: " + mes );
        System.out.print( "\nANO: " + anos );
        System.out.print( "\n" );
    }
}
