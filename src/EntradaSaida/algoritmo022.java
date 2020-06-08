/***********************************************
 * Ler nome, endereço e telefone e imprimi-los *
 ***********************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo022
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        String nome, endereço, telefone;

        System.out.print( "\nEntre com o nome: " );
        nome = digite.nextLine();
        System.out.print( "\nEntre com o endereço: " );
        endereço = digite.nextLine();
        System.out.print( "\nEntre com o telefone: " );
        telefone = digite.nextLine();
        System.out.println( "\n\n" );

        System.out.printf( "\nNome: %s", nome );
        System.out.printf( "\nEndereço: %s", endereço );
        System.out.printf( "\nTelefone: %s", telefone );
        System.out.println();
    }
}
