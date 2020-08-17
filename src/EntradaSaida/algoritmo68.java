/***************************************************************
 * Criar um algoritmo que, dado um número de conta corrente    *
 * com três dígitos, retorne o seu dígito verificador, o       *
 * qual é calculado da seguinte maneira: Exemplo: número da    *
 * conta: 235                                                  *
 * • Somar o número da conta com o seu inverso: 235+ 532 = 767 *
 * • multiplicar cada dígito pela sua ordem posicional e somar *
 * estes resultados: 7 6 7                                     *
 *                                                             *
 *      7   6    7                                             *
 *     x1  x2   x3                                             *
 *     7 + 12 + 21 = 40                                        *
 *                                                             *
 * • o último dígito desse resultado é o dígito verificador da *
 * conta (40 -> O).                                            *
 ***************************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo68
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int conta, inv, digito, d1, d2, d3, soma;

        System.out.print( "Digite conta de três digitos: " );
        conta = digite.nextInt();

        d1 = conta / 3;
        d2 = (conta % 100) / 10;
        d3 = (conta % 100) % 10;

        inv = d3 * 100 + d2 * 10 + d1;

        soma = conta + inv;

        d1 = soma / 10;
        d2 = ((soma % 100) / 10) * 2;
        d3 = ((soma % 100) % 10) * 3;

        digito = (d1 + d2 + d3) % 10;

        System.out.println( "Digito verificador: " +digito );
    }
}
