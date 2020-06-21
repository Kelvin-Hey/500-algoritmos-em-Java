/*****************************************************
 * Entrar com um número e imprimir a seguinte saída: *
 * numero :                                          *
 * quadrado :                                        *
 * raiz quadrada:                                    *
 *****************************************************/
 
 package EntradaSaida;
 import java.util.Scanner;
 
 public class algoritmo032
 {
     public static void main( String[] args )
     {
         Scanner digite = new Scanner( System.in );
         double num;
         double quad = 0;
         double raizQuadrada = 0;
         
         System.out.print( "Digite um número: " );
         num = digite.nextDouble();
         
         quad = (num ** 2);
         raizQuadrada = Math.sqrt(num);
         
         System.out.print( "\nnumero: " + num );
         System.out.print( "\nquadrado: " + quad );
         System.out.print( "\nraiz quadrada: " + raizQuadrada );
         System.out.println();
     }
 }
