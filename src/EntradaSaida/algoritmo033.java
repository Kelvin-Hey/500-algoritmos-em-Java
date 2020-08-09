/**********************************************************
 * Fazer um algoritmo que possa entrar com o saldo de uma *
 * aplicação e imprima o novo saldo, considerando o       *
 * reajuste de 1 %.                                       *
 **********************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo033
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double saldo, numSaldo;

        System.out.print( "Digite o saldo: " );
        saldo = digite.nextDouble();

        numSaldo = (saldo * 1.01);

        System.out.println( "\nNovo saldo: " + numSaldo );
    }
}
