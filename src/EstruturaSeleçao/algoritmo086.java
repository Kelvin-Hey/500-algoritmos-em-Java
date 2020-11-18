/**************************************************
 * Construir um algoritmo que indique se o número *
 * digitado está compreendido entre 20 e 90       *
 **************************************************/

package EstruturaSeleçao;

import java.util.Scanner;

public class algoritmo086 
{
  public static void main( String[] args ) 
  {
    Scanner digite = new Scanner( System.in );
    double num;

    System.out.print( "Digite um número: " );
    num = digite.nextInt();
    
    if ( num > 20 && num < 90 ) {
      System.out.println( "O número está na faixa de 20 a 90, exclusive" );
    } else {
      System.out.println( "O número está fora da faixa de 20 a 90" );
    }
  }
}
