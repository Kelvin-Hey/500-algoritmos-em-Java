/************************************************
 * Entrar com o ano de nascimento de uma pessoa *
 * e o ano atual. Imprimir a idade da pessoa.   * 
 * Não se esqueçã de verificar se o ano de      * 
 * nascimento é um ano válido                   *
 ************************************************/
 
 package EstruturaSeleção;
 
 import java.util.Scanner;
 
 public class algoritmo088
 {
  public static void main( String[] args )
  {
    Scanner digite = new Scanner( System.in );
    int anon, anoa;
    
    System.out.print( "Entre com o ano atual: " );
    anoa = digite.nextInt();
    System.out.print( "Entre com o ano de nascimento: " );
    anon = digite.nextInt();
    
    if ( anon > anoa ) {
      System.out.println( "ano de nascimento inválido" );
    } else {
      System.out.println( "idade = " + (anoa - anon) );
    }
  }
 }
