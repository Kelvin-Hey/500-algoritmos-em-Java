/*********************************************************
 * Dado um poligono convexo de n lados, podemos calcular *
 * o número de diagonais diferentes (nd) desse polígono  *
 * pela fórmula : nd = n(n - 3) / 2. Fazer uma algoritmo *
 * que leia quantos lados tem o polígono, calcule e      *
 * escreva o número de diagonais diferentes(nd) do mesmo *
 *********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo065
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double nd;
        int n;

        System.out.print( "Digite o número de lados do polígono: " );
        n = digite.nextInt();

        nd = (n * (n-3) / 2);

        System.out.println( "Número de diagonais : " +nd );
    }
}
