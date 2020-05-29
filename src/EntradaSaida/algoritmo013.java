package EntradaSaida;

import java.util.Scanner;

public class algoritmo013
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner( System.in );
        int num, numDezenas;

        System.out.print( "Digite o número de três casas: " );
        num = digite.nextInt();

        numDezenas = (10 % 10);

        System.out.print( "\nO algarismo da casa das dezenas é: " + numDezenas + "\n" );

        // Lembre-se sempre disto: quando você montar uma expressão com / e %, se /
        // vier antes de %, coloque parênteses para priorizar uma operação de hierarquia
        // menor.
    }
}
