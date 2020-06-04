/******************************************************
 * Entrar com um número inteiro de 3 casas e imprimir *
 * o algarismo da casa das deze-nas.                  *
 ******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo012_2
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int a = 0;
        int d;

        System.out.print( "\nDigite um número de três casas: " );
        a = digite.nextInt();

        d = (a / 10) % 10;
        System.out.print( "\nAlgarismo da casa das dezenas: " + d );
        System.out.println(); // pula uma linha
    }
}
