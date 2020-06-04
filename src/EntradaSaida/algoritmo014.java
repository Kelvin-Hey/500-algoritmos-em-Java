/*****************************************
 * Entrar com uma data no formato ddmmaa *
 * imprimir no formato mmddaa            *
 *****************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo014
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner(System.in);
        int data, dia, mes, ano, ndata;

        System.out.print("\nDigite a data no formato DDMMAA: ");
        data = digite.nextInt();

        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes * 10000 + dia * 100 + ano;

        System.out.print( "\nDIA: " + dia );
        System.out.print( "\nMÊS: " + mes );
        System.out.print( "\nANO: " + ano );

        System.out.println( "\n\nDATA NO FORMATO MMDDAA: " + ndata );
        System.out.println();
    }
}
