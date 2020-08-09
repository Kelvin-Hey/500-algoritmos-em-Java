/*******************************************************************
 * Antes de o racionamento de energia ser decretado, quase ninguém *
 * falava em quilowatts; mas, agora, todos incorporaram essa       *
 * palavra em seu vocabulário. Sabendo-se que 100 quilowatts de    *
 * energia custa um sétimo do salário mínimo, fazer um algoritmo   *
 * que receba o valor do salário mínimo e a quantidade de quilo-   *
 * watts gasta por uma residência e calcule. Imprima:              *
 * • o valor em reais de cada quilowatt                            *
 * • o valor em reais a ser pago                                   *
 * • o novo valor a ser pago por essa residência com um            *
 * desconto de 10%.                                                *
 *******************************************************************/

package EntradaSaida;
import java.util.Scanner;

public class algoritmo035
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double sm, quantidade, preco, vp, vd;

        System.out.print( "Entre com o salário mínimo: " );
        sm = digite.nextDouble();
        System.out.print( "Entre com a quantidade de quilowat: " );
        quantidade = digite.nextDouble();

        // Divide por 7 para achar o preço de
        // 100 Kw e por 100 para achar de 1 Kw
        preco = (sm / 700);

        vp = (preco * quantidade);
        vd = (vp * 0.9);

        System.out.print( "\nPreço do quilowatt: " + preco +
                          "\nValor a ser pago: " + vp +
                          "\nValor com desconto: " + vd );
    }
}
