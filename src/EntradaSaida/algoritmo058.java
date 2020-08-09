package EntradaSaida;

import java.util.Scanner;

public class algoritmo058
{
    public static void main( String[] args )
    {
        Scanner digite = new Scanner(System.in);
        int hora, tminuto, minuto;

        System.out.print( "Entre com a hora atual: " );
        hora = digite.nextInt();
        System.out.print( "Entre com minutos: " );
        minuto = digite.nextInt();

        tminuto = (hora * 60 + minuto);

        System.out.println( "Até agora se passaram: " +tminuto+ " minutos" );
    }
}
