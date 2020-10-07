/********************************************************
 * Criar um algoritmo que permita ao aluno responder    *
 * qual a ~capital do Brasil. To- das as possibilidades *
 * deverão ser pensadas.                                *
 ********************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo073
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        String resp = new String();

        System.out.print( "Qual a capital do Brasil? " );
        resp = digite.next();

        if ( resp == "BRASÍLIA" || resp == "Brasília" ) {
            System.out.println( "Parabéns!" );
        }

        else if ( resp =="brasília" || resp =="BRASÍLIA" ||
                  resp =="Brazília" || resp =="brazília" ) {
            System.out.println( "CERTO! mas atenção a grafia:" +
                    "BRASÍLIA ou Brasília" );
        }

        else {
            System.out.println( "ERRADO! ESTUDE MAIS" );
        }
    }
}
