//Separação baseado no pivo. Separa a direita do pivo os maiores e a esquerda os menores sem ordenação
//Declaração de variável e atribuição do valor de retorno do método require(local) que carregaráo módulo externo
const listaLivros = require('./20220402_01_Array');
//Declaração de função re retornará um array com a ordenação entre o valor da variável pivo e o menor valor encontrado. O pivo definirá a partir de onde será buscado os demais itens
function encontraMenores(pivo, array){
    //Declaração de variável e atribuição de valor de inicialização
    let quantidadeMenores = 0;
    //Loop for que iterará enquanto sua condição de parada for True. Em cada iteração será atingido o condicional que caso true incrementará 1 no valor da variável quantidadeMenores
    for(let atual = 0; atual < array.length; atual++){
        //Declaração de variável e atribuição do valor do elemento, com índice dado pela
        let prodAtual = array[atual];
        //Condicional que compara dois valores dos objetos e caso True executa o bloco de código
        if(prodAtual.preco < pivo.preco){
            //Incremento de 1 no valor da variável quantidadeMenores
            quantidadeMenores++
        }
    }
    //Evocação de função troca Lugar(par)
    trocaLugar(array, array.indexOf(pivo), quantidadeMenores);
    //Uso da keyword return para que a função retorne o valor atribuído à vairável array
    return array;
}
//Declaração de função que fará a troca de posições dos elementos do array passado como parâmetro, assim como a origem, onde elemento a ser trocado está e o para que será para onde o elemento deverá ser movido
function trocaLugar(array, origem, para){
    //Declaração de variáveis e atribuição dos valores dos elementos do array, dado pelo índice de valor da variável origem e para
    const elem1 = array[origem];
    const elem2 = array[para];
    //Atribuição de valores nos elementos do array definidos pelas variáveis para e origem, invertendo as posições de dentro do array
    array[para] = elem1;
    array[origem] = elem2;
}
//Declaração de função que dividirá o Array no pivo entre maiores à direita e menores a esquerda
function divideNoPivo(array){
    //Declaração de variável e atrubuição do valor do elemento do array com seu índice definido pelo resultado da operação matemática dentro do parâmentro do método Math.floor(par)
    let pivo = array[Math.floor(array.length / 2)];
    //Exição do valor da variável pivo
    console.log(pivo);
    //Evocação da função encontraMenores (par)
    encontraMenores(pivo, array);
    //Declaração de variável e atribuição de valor de inicialização
    let valoresMenores = 0;
    //Loop for irerará o bloco de código enquanto não for atingida a condição de parada. Loop este que fará a chamada da função trocaLugar(par) para cada iteração
    for(let analisando = 0; analisando < array.length; analisando++){
        //Declaração de variável e atribuição do valor do elemento de indice definido pelo valor da variável analisando 
        let agora = array[analisando];
        //Condicional simples que evocará a função trocaLugar(par) em caso True
        if(agora.preco <= pivo.preco && agora !== pivo){
            //Evocação da função trocaLugar(par) para ordenar a posição de dois valores
            trocaLugar(array, analisando, valoresMenores);
            //Incremento de 1 no valor da variável valoresMenores
            valoresMenores++;
        }
    }
    //Keyword return que fará a função retornar o valor da variável array
    return array;
}
//Exibição no formato de tabela o conteúdo da variável listaLivros e o retorno do método encontraMenores(par)
console.table(listaLivros);
console.table(divideNoPivo(listaLivros));
