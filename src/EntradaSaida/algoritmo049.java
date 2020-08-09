/************************************************
 * Em épocas de pouco dinheiro, os comerciantes *
 * estão procurando aumentar suas vendas        *
 * oferecendo desconto. Faça um algoritmo que   *
 * possa entrar com o valor de um produto e     *
 * imprima o novo valor tendo em vista que o    *
 * desconto foi de 9%                           *
 ************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo049
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        double preco, nPreco;

        System.out.print( "Digite o valor do produto: " );
        preco = input.nextDouble();

        nPreco = preco * 0.91;

        System.out.println( "Preço com desconto: " + nPreco );
    }
}