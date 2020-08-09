/*******************************************************
 * Criar um algoritmo que leia um número entre Oe 60 e *
 * imprimir o seu sucessor, sa- bendo que o sucessor de*
 * 60 é O. Não pode ser utilizado nenhum comando de    *
 * seleção e nem de repetição                          *
 *******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo063
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num;

        System.out.print( "Digite um número: " );
        num = digite.nextInt();

        System.out.println( "Sucessor: " +((num + 1) % 61) );
    }
}
