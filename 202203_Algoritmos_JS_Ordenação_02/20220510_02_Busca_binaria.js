//Busca binária de elemento em um array já ordenado
//Declaração de variável e atribuição do módulo externo que foi evocado pelo método require(args)
const listaLivros = require('./20220510_01_Array');
//Declaração de função que fará a busca do valor da variável valorBuscado no array, passando o ponto inicial como sendo o valor da variável de e o ponto de parada sendo o valor da variável para
function busca(array, de, ate, valorBuscado){
    //Declaração de variável e atribuição do valor de resultado da expressão matemática, onde houve arredondamento para baixo via método Math.floor(valor), com retorno de um inteiro
    const meio = Math.floor((de + ate) / 2);
    //Declaração de variável e atribuição do valor do elemento do array, dado pelo valor da variável meio
    const atual = array[meio];
    //Condicional que verificará se o valor da variável de é maior que o valor da variável para, caracterizando recursão infinita e retornando um valor arbitrário 
    if(de > ate){
        //Uso da keyword return para retornar o valor arbitrário -1
        return -1;
    }
    //Condicional que verifica se o elemento buscado é o elemento atribuido à variável meio
    if(valorBuscado === atual.preco){
        return meio;
    }
    //Condicional que verificará se o valor da variável valorBUscado é menor do que o valor do elemento da variável atual
    if(valorBuscado < atual.preço){
        //Uso da keyword return para retornar o valor da função busca, porém com uso recursivo e atribuição de valor pertinente à condição aos parâmetros
        return busca(array, de, meio - 1, valorBuscado)
    }
    //Condicional que verificará se o valor da variável valorBuscado é maior do que o valor do elemento da variável atual
    if(valorBuscado > atual.preco){
        //Uso da keyword return para retornar o valor da função busca, porém com uso recursivo e atribuição de valor pertinente à condição aos parâmetros
        return busca(array, meio + 1, ate, valorBuscado)
    }
}
//Exibição o console do valor de retorno da função busca, onde o valor buscado foi arbitrariamente
console.log(busca(listaLivros, 0, listaLivros.length - 1, 30));
