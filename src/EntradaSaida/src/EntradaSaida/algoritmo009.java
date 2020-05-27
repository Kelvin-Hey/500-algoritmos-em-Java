/*************************************
 * Escreva um algoritmo que mostre a *
 * maioria da funções String         *
 *************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo009
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        String c = new String();
        String c1 = new String();
        String d = new String();
        String d1 = new String();

        System.out.print( "Digite a palavra 1: " );
        c = digite.nextLine();
        System.out.print( "Digite a palavra 2: " );
        c1 = digite.nextLine();

        System.out.println( "\nTamanho da palavra 1: " + c.length() + " letras" );
        System.out.println( "concatenando as duas palavras: " + c.concat( c1 ) );

        d = c;
        System.out.println( "\nAtribuindo o valor da palavra 1 a d..." );
        System.out.println( "\nO CONTEÚDO DE D: " + d );

        d1 = c.concat( c1 );

        System.out.println( "\nconcatenação: " + d1 );
        System.out.println( "Primeiro caractere da palavra 1: " + c.charAt(0) );
        System.out.println( "Último caractere da palavra 1: " +
                            c.substring( c.length() - 1 ) );
        System.out.println( "Todos os caracteres da palavra 1 menos o primeiro: " +
                            c.substring( 1, c.length() - 1 ) );
        System.out.println( "\nO terceiro elemento da palavra 1: " + c.charAt(3) );
        System.out.println( "\nOs três primeiros elementos da palavra 1: " +
                            c.substring( 0, 3 ) );
        System.out.println( "\nOs três últimos caracteres da palavra 1: " +
                             c.substring( c.length() - 3 ) );
    }
}
