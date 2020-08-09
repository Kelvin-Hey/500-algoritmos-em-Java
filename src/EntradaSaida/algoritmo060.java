/**********************************************************************
 * Criar um algoritmo que receba um número real, calcular e imprimir: *
 * • a parte inteira do número                                        *
 * • a parte fracionária do número                                    *
 * • o número arredondado                                             *
 **********************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo060
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double num, numFrac;
        int numi, numa;

        System.out.print( "Entre com um número com parte fracionária: " );
        num = digite.nextDouble();

        numi = (int) (num - 0.5);
        numFrac = (num - numi);
        numa = (int) (num + 0.00001);

        System.out.println( "Parte inteira: " +numi );
        System.out.println( "Parte fracionária: " + (numFrac + 0.00001));
        System.out.println( "Número arredondado: " +numa );
    }
}
