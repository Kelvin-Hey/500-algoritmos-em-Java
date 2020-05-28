/*********************************
 * Faça um algoritmo para testar *
 * a hierarquia entre números    *                            *
 *********************************/

package EntradaSaida;

public class algoritmo010
{
    public static void main( String[] args )
    {
        System.out.println( "TESTANDO HIERARQUIA\n" );
        System.out.println( "12 + 6/2 é igual a: " + 12 + 6 / 2 );
        System.out.println( "É DIFERENTE DE (12 + 6) / 2 que é igual a: " + (12 + 6) / 2 +
                            ". Logo, / tem HIERARQUIA MAIOR do que + ou -" );
        // Math.pow -> eleva o número a determinada potência
        System.out.println( "\n64 ** 1/4 é igual a: " + Math.pow( 64, 1/4 ) );
        System.out.println( "\nÉ DIFERENTE DE 64 ** (1/4) que é igual a: " +
                            Math.pow( 64, 0.25 ) + ". Logo, ** tem HIERARQUIA MAIOR +" +
                            " do que * ou / " );
        System.out.println( "\n3 * 7 / 5 é igual a: " + 3 * 7 / 5 );
        System.out.println( "É IGUAL a (3 * 7) div 5 que equivale a " + (3 * 7) / 5 +
                            ". Logo, / tem MESMA HIERARQUIA da * ou / " );
    }
}
