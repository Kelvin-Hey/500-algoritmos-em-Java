/***************************************
 * Entrar com o nome, idade e imprimir *
 * a seguinte saída:                   *
 * nome:                               *
 * idade:                              *
 ***************************************/
package EntradaSaida;
import java.util.Scanner;

public class algoritmo043
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        String nome = new String();
        int idade;

        System.out.println( "Digite o nome: " );
        nome = digite.nextLine();
        System.out.println( "Digite a idade: " );
        idade = digite.nextInt();

        System.out.println();
        System.out.println( "nome = " + nome );
        System.out.println( "idade = " + idade );
    }
}
