//Encontra menores
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
        if(prodAtual.preco < pivo.preco){
            //Incremento de 1 no valor da variável quantidade menores
            quantidadeMenores++
        }
        //Evocação de função troca Lugar(par)
        trocaLugar(array, array.indexOf(pivo), quantidadeMenores);
    }
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
//Exibição no formato de tabela o conteúdo da variável listaLivros e o retorno do método encontraMenores(par)

//Comentado para não aparecer na execução de 20220430_02_Quick_sort.js
//console.table(listaLivros);
//console.table(encontraMenores(listaLivros[2], listaLivros));

module.exports = trocaLugar;