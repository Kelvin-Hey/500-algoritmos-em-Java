/****************************************************
 * Entrar com um número inteiro de 3 casas imprimir *
 * o algarismo da casa das deze-nas.                *
 ****************************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo012
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num, numDezenas;

        System.out.print( "Digite o número de três casas: " );
        num = digite.nextInt();

        numDezenas = ((num % 100) / 10);

        System.out.print( "\nO algarismo da casa das dezenas é: " + numDezenas + "\n" );

        // Se a idéia é efetuar a operação com / antes, teremos problema, pois o
        // operador % tem hierarquia maior que /; logo, primeiro será operado
        // 10 % 1, cujo o resultado é zero (O). Isso impossibilita a operação com div,
        // uma vez que não se pode dividir por O.
    }
}
