/********************************************************
 * Entrar com dois números reais e imprimir a média     *
 * aritmética com a mensagem "média" antes do resultado *
 ********************************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo026
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner( System.in );
        double nota1, nota2, media;

        System.out.print( "\nDigite a nota 1: " );
        nota1 = entrada.nextDouble();
        System.out.print( "\nDigite a nota 2: " );
        nota2 = entrada.nextDouble();

        media = ((nota1 + nota2) / 2);

        System.out.print( "\nMédia: " + media );
    }
}
