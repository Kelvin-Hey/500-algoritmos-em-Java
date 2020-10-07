/*****************************************************
 * Faça um algoritmo para calcular o peso do planeta *
 *****************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo074
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int op;
        double pTerra;

        System.out.println( "Planetas que podem ser analisados " );
        System.out.println( "1 Mercúrio" );
        System.out.println( "2 Venus" );
        System.out.println( "3 Marte" );
        System.out.println( "4 Jupiter" );
        System.out.println( "5 Saturno" );
        System.out.println( "6 Urano" );

        System.out.print( "Escolha o planeta a ser analisado: " );
        op = digite.nextInt();
        System.out.print( "Entre com o peso na Terra: " );
        pTerra = digite.nextDouble();

        switch( op ) {

            case 1:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra / 10) * 0.37 );
                break;
            case 2:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra / 10) * 0.88 );
                break;
            case 3:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra / 10) * 0.38 );
                break;
            case 4:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra/ 10) * 2.64 );
                break;
            case 5:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra / 10) * 1.15 );
                break;
            case 6:
                System.out.println( "Seu peso no planeta Terra é: " + (pTerra / 10) * 1.17 );
                break;
            default:
                System.out.println( "Esse planeta não pode ser analisado: " );
                break;
        }

    }
}
