/*************************************************************
 * Entrar com um número no formato CDU e imprimir invertido: *
 * UDC. (Exemplo: 123, sairá 321.) O número deverá ser       *
 * armazenado em outra variável antes de ser impresso.       *
 *************************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo034
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int c, d, u, num, num1;

        System.out.print( "Entre com um número de três dígitos: " );
        num = digite.nextInt();

        c = (num / 100);
        d = ((num % 100) / 10);
        u = (num % 10);

        num1 = ((u * 100) + (d * 10) + c);

        System.out.println( "\nNúmero: " + num );
        System.out.println( "Invertido: " + num1 );
    }
}
