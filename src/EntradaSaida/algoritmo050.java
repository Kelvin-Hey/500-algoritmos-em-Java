/********************************************************
 * Criar um salário que calcule o salário líquido de um *
 * professor. Os dados fornecidos serão: valor da hora  *
 * aula, número de aulas dadas no mês e percentual de   *
 * desconto do INSS                                     *
 ********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo050
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int na;
        double vha, pd, td, sb, sl;

        System.out.print( "Horas trabalhadas: ");
        na = digite.nextInt();
        System.out.print( "Valor da hora-aula: " );
        vha = digite.nextDouble();
        System.out.print( "Percentual de desconto: " );
        pd = digite.nextDouble();

        sb = (na * vha);
        td = ((pd / 100) * sb);
        sl = (sb - td);

        System.out.println( "Salário líquido: " + sl );
    }
}
