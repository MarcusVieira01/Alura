//Implementação do algoritmo merge sort
//Declaração de variável e atribuição do valor de retorno do método que carrega um módulo externo
const listaLivros = require('./20220331_01_Array');
//Declaração de função mergeSort(par) que fará a separação e organização de um array de objetos
function mergeSort(array){
    //Condicional que caso true executará o bloco de código. Esse condicional que será a condição de parara da recursão abaixo
    if(array.length > 1){
        //Declaração de variável e atribuição do valor de resultado da expressão matemática
        const meio = Math.floor(array.length / 2);
        //Declaração de variável e atribuição do valor de retorno da função mergeSort(par) que está em chamada recursiva. Seu parâmetro é passado pelo retorno do método array.slice(ini, fim). A cada recursão o array se torna menor até que o condicional seja false
        const parte1 = mergeSort(array.slice(0, meio));
        const parte2 = mergeSort(array.slice(meio, array.length));
        //Atribução do valor de retorno da função ordena(par)
        array = ordena(parte1, parte2);
    }
    //Uso da keyword return para que o valor da variável array seja entregue como retorno da função chamada
    return array;
}
//Declaração da função auxiliar que fará a ordenação entre dois objetos passados nos parâmetros
function ordena(parte1, parte2){
    //Declaração de variáveis e atribuição dos seus valores de incialização
    let posAtualParte1 = 0;
    let posAtualParte2 = 0;
    const resultado = [];
    //Loop while que enquanto true fará a ordenação de dois objetos
    while(posAtualParte1 < parte1.length && posAtualParte2 < parte2.length){
        //Declaração de variáveis e atribuição de valores chamados via notação de colchetes dos objetos passados nos parâmetros da função
        let prodAtualParte1 = parte1[posAtualParte1];
        let prodAtualParte2 = parte2[posAtualParte2];
        //Condicional que definirá a ordenação dos objetos do com menor preço para o de maior preço
        if(prodAtualParte1.preco < prodAtualParte2.preco){
            //Método array.push(par) que incrementará após o último elemento do array, o valor do elemento do parâmetro
            resultado.push(prodAtualParte1);
            //Incremento de 1 no valor da variável
            posAtualParte1++;
        //Condição que executará o bloco caso o condicional if for false
        }else{
            //Método array.push(par) que incrementará após o último elemento do array, o valor do elemento do parâmetro
            resultado.push(prodAtualParte2);
            //Incremento de 1 no valor da variável
            posAtualParte2++;
        }
    }
    //Uso da palavra chave return que retornará o valor do método array.concat(par) onde foi passado de parâmetro um operador condicional ternário
    return resultado.concat(posAtualParte1 < parte1.length
    ? parte1.slice(posAtualParte1)
    : parte2.slice(posAtualParte2));
}
//Exibição no formato de tabela o valor de retorno da função mergeSort(par)
console.table(mergeSort(listaLivros));
