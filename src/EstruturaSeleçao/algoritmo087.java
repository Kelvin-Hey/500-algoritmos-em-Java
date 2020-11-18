/*******************************************
 * Entrar com um número e imprimir uma das *
 * mensagens: maior que 20, igual a 20 e   *
 * menor que 20                            *
 *******************************************/
 
 package EstruturaSeleção;
 
 import java.util.Scanner;
 
 public class algoritmo087
 {
  public static void main( String[] args )
  {
    Scanner digite = new Scanner;
    double numero;
    
    System.out.print( "Digite um número: " );
    numero = digite.nextDouble();
    
    if ( numero > 20 ) {
      System.out.println( "maior que 20" );
    } else if ( numero < 20 ) {
      System.out.println( "menor que 20" );
    } else {
      System.out.println( "igual a 20" );
    }
  }
 }
