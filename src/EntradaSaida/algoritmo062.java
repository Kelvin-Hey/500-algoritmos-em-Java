/******************************************************
 * Criar um algoritmos que leia o peso de uma pesooa, *
 * só a parte inteira, calcular e imprimir:           *
 * · O peso da pessoa em gramas;                      *
 * · O novo peso da pessoa se ela engordar 12 kilos   *
 ******************************************************/

package EntradaSaida;

import java.util.Scanner;

public class algoritmo062
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int peso, pesogramas;
        double novopeso;

        System.out.print( "Entre com o seu peso, só a parte inteira: " );
        peso = digite.nextInt();

        pesogramas = (peso * 1000);
        novopeso = (pesogramas * 1.12);

        System.out.println( "Peso em grams: " +pesogramas );
        System.out.println( "Novo peso: " +novopeso );
    }
}
