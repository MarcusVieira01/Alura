/**
 * @author Marcus Vieira
 * @version v1.0
 * @since 2022
 * @category Teste
 */
public class Teste {
    public static void main(String[] args) {
        
        //Declaração de variáveis do tipo Prioridade e atribuição da referência do "objeto" enum definido pelo nome .MIN, .MAX e .NORMAL
        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;
        Prioridade pNor = Prioridade.NORMAL;

        //Exibição dos valores de retorno dos métodos
        System.out.println(pMin.name());
        System.out.println(pNor.name());
        System.out.println(pMax.name());
        System.out.println(pMin.ordinal());      
        System.out.println(pNor.ordinal());   
        System.out.println(pMax.ordinal());
        System.out.println("Valor atribuido pMin: " + pMin.getValor());
        System.out.println("Valor atribuido pNor: " + pNor.getValor());
        System.out.println("Valor atribuido pMax: " + pMax.getValor());
    }
}
