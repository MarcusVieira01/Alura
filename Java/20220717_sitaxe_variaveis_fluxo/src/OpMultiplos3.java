import java.util.ArrayList;

public class OpMultiplos3 {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instancia de novo objeto lista, via classe ArrayList, do tipo não primitivo Integer
        ArrayList<Integer> lista = new ArrayList<Integer>();
        //Loop que viterará o condicional composto, onde será definido se o valor da variável de controle do loop é múltipla de 3. Caso true, será armaenado no objeto array lista, caso false será atingida a keywork continue que fará o loop continuar sem paradas
        for(int numero = 1; numero <= 100; numero ++){
            if(numero % 3 == 0){
                lista.add(numero);
            }else{
                continue;
            }
        }
        //Exibição do valor do objeto array lista
        System.out.println(lista);
    }
}
