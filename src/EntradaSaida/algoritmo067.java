/**********************************************************
 * Criar um algoritmo que leia a quantidade de fitas que  *
 * uma locadora de vídeo pos- sui e o valor que ela cobra *
 * por cada aluguel, mostrando as informações pedidas a   *
 * seguir:                                                *
 * • Sabendo que um terço das fitas são alugadas por mês, *
 * exiba o faturamento anual da locadora;                 *
 * • Quando o cliente atrasa a entrega, é cobrada uma     *
 * multa de 10% sobre o valor do aluguel. Sabendo que um  *
 * décimo das fitas alugadas no mês são devolvidas com    *
 * atraso, calcule o valor ganho com multas por mês;      *
 * • Sabendo ainda que 2% de fitas se estragam ao longo   *
 * do ano, e um décimo do total é comprado para reposição *
 * exiba a quantidade de fitas que a locadora terá no     *
 * final do ano.                                          *
 **********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo067
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int quant;
        double valAluguel, fatAnual, multas, quantFinal;

        System.out.print( "Digite a quantidade de fita: " );
        quant = digite.nextInt();
        System.out.print( "Digite o valor do aluguel: " );
        valAluguel = digite.nextInt();

        fatAnual = ((quant / 3) * (valAluguel * 13));

        System.out.println( "Faturamento anual: " +fatAnual );

        multas = ((valAluguel * 0.1) * ((quant / 3) / 10));

        System.out.println( "Multas mensais: " +multas );

        quantFinal = (quant - (quant * 0.2) + (quant / 10));

        System.out.println( "Quantidade de fitas no final do ano: " +quantFinal );
    }
}
