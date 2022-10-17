//Index
//Realiza o união entre duas listas já pré ordenadas, ordenando os elementos por ordem crescente de valor em um array
//Declaração de múltiplas variáveis e atribuição do retorno do método require(local) que retorna os arrays do arquivo 20220330_01_Arrays.js
const { edGalho, edFolha } = require('./20220330_01_Arrays');
//Declaração de função de ordenação de duas listas passadas via parâmetros
function juntarListas(lista1, lista2){
    //Declaração de variáveis e atribuição de valores de inicialização
    let listaFinal = [];
    let posAtualLista1 = 0;
    let posAtualLista2 = 0;
    let posAtualListaFinal = 0;
    //Loop while que fará a ordenação inicial das listas enquanto ambas condições sobre o tamanho da lista seja Tue
    while(posAtualLista1 < lista1.length && posAtualLista2 < lista2.length){
        //Declaração de variáveis e atribuição dos valores dos elementos iniciais das listas de objetos via variáveis posAtualLista1 e posAtualLista2 préviamente inicializadas
        let prodAtualLista1 = lista1[posAtualLista1];
        let prodAtualLista2 = lista2[posAtualLista2];
        //Condicional que fará a atribuição no elemento definido pela variável posAtualListaFinal do valor da variável prodAtualLista1
        if(prodAtualLista1.preco < prodAtualLista2.preco){
            listaFinal[posAtualListaFinal] = prodAtualLista1;
            //Incremento de 1 no valor da variável posAtualLista1
            posAtualLista1++;
            //Condicional que fará a atribuição no elemento definido pela variável posAtualListaFinal do valor da variável prodAtualLista2
        }else{
            listaFinal[posAtualListaFinal] = prodAtualLista2
            //Incremento de 1 no valor da variável posAtualLista2
            posAtualLista2++;
        }
        //Incremento de 1 no valor da variável posAtualListaFinal
        posAtualListaFinal++;
    }
    //Loop que continuará a ordenar a lista1 caso seu tamanho seja maior que a variável posAtualLista1
    while(posAtualLista1 < lista1.length){
        //Atribuição do valor do elemento da lista1 definido pela variável posAtualLista1
        listaFinal[posAtualListaFinal] = lista1[posAtualLista1];
        //Incremento de 1 no valor das variáveis posAtualLista1 e posAtualListaFinal
        posAtualLista1++;
        posAtualListaFinal++;
    }
    //Loop que continuará a ordenar a lista2 caso seu tamanho seja maior que a variável posAtualLista2
    while(posAtualLista2 < lista2.length){
        //Atribuição do valor do elemento da lista2 definido pela variável posAtualLista2
        listaFinal[posAtualListaFinal] = lista2[posAtualLista2];
        //Incremento de 1 no valor das variáveis posAtualLista2 e posAtualListaFinal
        posAtualLista2++;
        posAtualListaFinal++;
    }
    //Retorno do valor da variável listaFinal
    return listaFinal;
}
//Exibição no console de forma tabulada do retorno da função juntarListas(par, par)
console.table(juntarListas(edGalho, edFolha));
