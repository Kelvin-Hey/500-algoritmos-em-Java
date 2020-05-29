package EntradaSaida;

public class algoritmo011
{
    public static void main( String[] args )
    {
        System.out.printf( "\nTESTANDO HIERARQUIA" );

        // Evite usar printf quando for fazer divisões usando o operador
        // módulo, pois o mesmo é usado para especifar o tipo numérico
        System.out.print( "\n18 / 6 % 2 é igual a: " + (18 / 6 % 2 ) );
        System.out.print( "\nUma operação de divisão fora de parênteses não pode ser um "
                            + "\ndos operandos de uma expressao com %." );
        System.out.print( "\n20 / 4 div 2 é igual a: " + (20 / 4 / 2) );
        System.out.print( "\nÉ IGUAL a (20 / 4) div 2 : " + ((20 / 4) / 2) +
                          "\nlogo div tem a MESMA HIERARQUIA " );
        
        // Cuidado! procure não usar um ponto depois de uma barra(/),
        // pois assim voçê poderá estar indicando um diretório.
        // Ex: System.out.print( "da /." );
        System.out.print( " da / " );
        System.out.print( "\n\n30 / 4 div 2 é igual a: " + (30 / 4 / 2 ) );
        System.out.print( "\nÉ IGUAL a (30 / 4) div 2 : " + ((30 / 4) / 2) +
                          " logo div tem a MESMA HIERARQUIA " );
        System.out.print( " da / " );
        // Muita atenção para o uso dos operadores % e div numa expressão.
        // Se % vier antes, não tem problema.
    }
}
