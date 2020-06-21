/*****************************************************
 * Entrar com um número e imprimir a seguinte saída: *
 * numero :                                          *
 * quadrado :                                        *
 * raiz quadrada:                                    *
 *****************************************************/
 
 package EntradaSaisda;
 import java.util.Scanner;
 
 public class algoritmo032
 {
     public static void main( String[] args )
     {
         Scanner digite = new Scanner( System.in );
         double num, quad, raizQuadrada;
         
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
