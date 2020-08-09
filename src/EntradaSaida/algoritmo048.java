/***************************************************
 * Entrar com a razão de uma PG e o valor do 1Q.   *
 * termo. Calculare imprimir o 5Q. termo da série.
 ***************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo048
{
    public static void main(String[] args)
    {
        Scanner digite = new Scanner(System.in);
        int quinto, razao, termo;

        System.out.print( "Entre com o 1 termo: " );
        termo = digite.nextInt();
        System.out.print( "Entre com a razão|: " );
        razao = digite.nextInt();

        quinto = (int) (termo * Math.pow(razao, 4));

        System.out.println( "O quinto termo dessa PG é: " + quinto );

    }
}