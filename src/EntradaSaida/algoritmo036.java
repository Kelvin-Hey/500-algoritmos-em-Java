/**********************************
 * Entrar com um nome e imprimir: *
 * nome completo:                 *
 * primeiro caractere:            *
 * ultimo caractere:              *
 * do primeiro ate o terceiro:    *
 * quarto caractere:              *
 * todos menos o primeiro:        *
 * os dois ultimas:               *
 **********************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo036
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int n;

        System.out.print( "Entre com um nome: " );
        n = digite.nextInt();

        System.out.println( "\nNome completo: " + n );
        System.out.println( "Primeiro caractere");

    }
}
