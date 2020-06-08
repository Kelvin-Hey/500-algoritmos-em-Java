/*********************************************************
 * Ler dois números inteiros e imprimir a soma. Antes do *
 * resultado, deverá aparecera mensagem: Soma.           *
 *********************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo023
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num1, num2, soma;

        System.out.print( "\nEntre com um número: " );
        num1 = digite.nextInt();
        System.out.print( "\nEntre com outro número: " );
        num2 = digite.nextInt();

        soma = (num1 + num2);

        System.out.printf( "\nSoma: %s", soma );
        System.out.println();
    }
}
