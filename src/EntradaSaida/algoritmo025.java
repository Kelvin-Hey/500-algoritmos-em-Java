/************************************************************
 * Ler um número real e imprimir a terça parte deste número *
 ************************************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo025
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner( System.in );
        double num;

        System.out.print( "\nEntre com um número com vírgula: " );
        num = entrada.nextDouble();

        System.out.println( "\nA terça parte é: " + (num/3) );
    }
}
