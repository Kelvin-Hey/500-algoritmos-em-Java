/***********************************************************************
 * A prefeitura do Rio de Janeiro abriu uma linha de crédito para os f *
 * uncionários estatutários. O valor máximo da prestação não poderá ul *
 * trapassar 30% do salário bruto. Fazer um algoritmo que permita entr *
 * ar com o salário bruto e o valor da prestação e informar se o empré *
 * stimo pode ou não ser concedido.
 ***********************************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo083
{
    public static void main(String[] args)
    {
        Scanner digite = new Scanner( System.in );
        double sb, vp;

        System.out.print( "Digite o salário: " );
        sb = digite.nextDouble();
        System.out.print( "Digite o valor da prestação: " );
        vp = digite.nextDouble();

        if ( vp <= 0.3 * sb ) {
            System.out.println( "empréstimo concedido" );
        } else {
            System.out.println( "empréstimo negado" );
        }
    }
}
