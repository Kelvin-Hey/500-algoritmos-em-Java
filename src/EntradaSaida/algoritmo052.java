/********************************************************
 * Calcular e apresentar o volume de uma lata de óleo   *
 * utilizando a fórmula: volume = 3.14159 * R² * altura *
 ********************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo052
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        double volume, altura, raio;
        double pi = 3.14159;

        System.out.print( "Digite a altura da lata: " );
        altura = digite.nextDouble();
        System.out.print( "Digite o raio da lata: " );
        raio = digite.nextDouble();

        volume = (pi * raio * (raio * raio) * altura);

        System.out.println( "O volume da lata é " + volume );
    }
}
