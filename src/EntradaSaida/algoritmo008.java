/***********************************
 * Faça um algoritmo que envolva a *
 * maioria das funções numéricas   *
 ***********************************/

package EntradaSaida;

public class algoritmo008
{
    public static void main( String[] args )
    {
        System.out.println( "Raiz quadrada de 64: " + Math.sqrt( 64 ) );
        System.out.println( "Raiz cúbica de 64: " + Math.cbrt( 64 ) );
        System.out.println( "Logaritimo do número 64: " + Math.log( 64 ) );
        System.out.println( "Seno de 45: " + Math.sin( 45 ) );
        System.out.println( "Valor absoluto de 8: " + Math.abs( 8 ) );
        System.out.println( "Valor absoluto de -8: " + Math.abs( -8 ) );

        // quando for converter valores usando intValue ou doubleValue,
        // use o nome da variável completo e com letra maiúscula.
        // Ex: Integer x em vez de int x
        Double real = 5.5;
        System.out.println( "Convertendo 5.5 para inteiro " + real.intValue() );
        Integer inteiro = 5;
        System.out.println( "Convertendo 5 para real: " + inteiro.doubleValue() );
    }
}
