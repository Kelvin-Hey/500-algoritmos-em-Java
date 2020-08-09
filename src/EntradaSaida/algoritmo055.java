/*****************************************************
 * Ler dois valores para as variáveis A e B, efetuar *
 * a troca dos valores de forma que a variável A     *
 * passe a ter o valor da variável B e que a variável*
 * B passe a ter o valor da variável A.              *
 *****************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo055
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double a, b, aux;

        System.out.print( "Digite o primeiro número com ponto: " );
        a = digite.nextDouble();
        System.out.print( "Digite o segundo número com ponto: " );
        b = digite.nextDouble();

        aux = a;
        a = b;
        b = aux;

        System.out.println( "\na = " +a+ "\nb = " +b );
        
    }
}
