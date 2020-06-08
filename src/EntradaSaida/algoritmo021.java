/************************************
 * Ler um número inteiro e imprimir *
 * seu sucessor e seu antecessor    *
 ************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo021
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int numero, suc, ant;

        System.out.println( "entre com um número: " );
        numero = digite.nextInt();

        ant = (numero - 1);
        suc = (numero + 1);

        System.out.println( "\nO sucessor é "+ suc + " e o antecessor é " +
                            ant + "\n" );
    }
}
