public class OpAliquotaIRRF {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declarçaão de variável e atribuição de valor de inicialização
        double salario = 3300.00;

        //Condicionais encadeados para avaliar a qual faixa do valor da variável salario se enquadra e exibição da mensagem pertinente 
        if(salario >= 1900 && salario <= 2800){
            //Exibição de mensagem pertinente
            System.out.println("IR de 7,5% e dedução de 142,00!");
        }else if(salario >= 2800.01 && salario <= 3751.00){
            //Exibição de mensagem pertinente
            System.out.println("IR de 15% e dedução de 350,00!");
        }else if(salario >= 3751.01 && salario <= 4664.00){
            //Exibição de mensagem pertinente
            System.out.println("IR de 22.5% e dedução de 636,00!");
        }else{
            //Exibição de mensagem pertinente
            System.out.println("Tá roubando tanto que nem a Receita quer saber!");
        }
    }
}
