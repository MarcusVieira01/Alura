//Insertion Sort
//Declaração de variável e atribuição de array proveniente de um módulo externo. Atribuição realizada via método require(local)
const livros = require('./20220326_02_Exibindo_livros');
//Exibição por tabulação do array de objetos atribuídos à variável lista
console.table(livros);
//Declaração de função insertionSort9array)
function insertionSort(lista){
    //Loop for que varrerá o array de objetos
    for(let atual = 0; atual < lista.length; atual++){
        //Declaração de variávle e atribuição do valor da variável de controle do loop for
        let analise = atual;
        //Loop while que varrerá as posições do array de objetos lista e executará o bloco de código
        while(analise > 0 && lista[analise].preco < lista[analise - 1].preco){
            //Declaração de variáveis que registrarão os dados retornos
            let itemAnalise = lista[analise];
            let itemAnterior = lista[analise - 1];
            //Atribuição de valores para que o array de objetos lista seja reordenado
            lista[analise] = itemAnterior;
            lista[analise - 1] = itemAnalise;
            //Decréssimo do valor da variável análise para que o loop while tenha uma condição de parada
            analise--;
        }
    }
    //Exibição por tabulação do array de objetos atribuído e reeordenado à variável lista
    console.table(lista);
}
//Evocação da função insertionSort(par)
insertionSort(livros);
