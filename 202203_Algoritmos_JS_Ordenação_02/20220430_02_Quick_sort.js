//Quick Sort
//Declaração de variáveis e atribuição do retorno da função require que importará os módulos dos arquivos que constam nos parâmetros
const listaLivros = require('./20220430_01_Array');
const trocaLugar = require('./20220402_01_Encontra_menores')
//Declaração de função principal do algoritmo, que realizará o quick sort ordenando o array de forma crescente em valor de preço
function quickSort(array, esquerda, direita){
    //Condicional que avaliará o comprimento do Array. Caso false, nada será feito
    if(array.length > 1){
        //Declaração de variável e atribuição do valor de retorno da função particiona(args)
        let indiceAtual = particiona(array, esquerda, direita);
        //Condicional que avaliará se o valor da variável esquerda é menor que o valor da variável indiceAtual decrescendo 1. Caso false nada será feito
        if(esquerda < indiceAtual - 1){
            //Evocação da função Quick Sort de forma recursiva, onde a condição de parada da-se no primeiro condicional, pelo lado esquerdo do array
            quickSort(array, esquerda, indiceAtual - 1);
        }
        //Condicional que avaliará se o valor da variável direita é menor que o valor da variável indiceAtual decrescendo 1. Caso false nada será feito
        if(indiceAtual < direita){
            //Evocação da função Quick Sort de forma recursiva, onde a condição de parada da-se no primeiro condicional, pelo lado direito do array
            quickSort(array, indiceAtual, direita);
        }
    }
    //Uso da keyword return que fará o retorno do array modificado
    return array;
}
//Declaração de função que particionará o array em dois pontos definidos pelas variáveis esquerda e direita, fará a troca de posição dos elementos do array caso cabível e retornará o valor da variável atualEsquerda
function particiona(array, esquerda, direita){
    //Inserção de métodos para exibição de mensagens e os valores das variáveis, para que seja possível análise do fluxo de dados
    console.log('array', array);
    console.log('esquerda, direita', esquerda, direita)
    //Declaração de variável e atribuição do elemento do array de índice dado pelo resultado arredondado da expressão matemática
    let pivot = array[Math.floor((esquerda + direita) / 2)];
    //Declaração de variáveis de controle e atribução dos valores iniciais, inputados nos parâmetros da função
    let atualEsquerda = esquerda;
    let atualDireita = direita;
    //Loop While que valida a execução dos blocos abaixo enquanto a comparação dos valores das variáveis de controle atuais seja true, ou seja, não se cruzem
    while(atualEsquerda <= atualDireita){
        //Loop While que executará o bloco abaixo enquanto a comparação for true, pois indicará que não há necessidade de ordenação nos elementos
        while(array[atualEsquerda].preco < pivot.preco){
            //Incremento de 1 ao valor da variável atualEsquerda
            atualEsquerda++;
        }
        //Loop While que executará o bloco abaixo enquanto a comparação for true, pois indicará que não há necessidade de ordenação nos elementos
        while(array[atualDireita].preco > pivot.preco){
            //Decréscimo de 1 ao valor da variável atualDireita
            atualDireita--;
        }
        //Condicional que executará o bloco abaixo caso as variáveis de controle não tenham se cruzado, realizando a troca de posição dos elementos via função trocaLugar(args)
        if(atualEsquerda <= atualDireita){
            //Evocação de função trocaLugar(args) advinda de módulo externo, que fará a troca de posição de elementos do array
            trocaLugar(array, atualEsquerda, atualDireita);
            //Incremento de 1 ao valor da variável atualEsquerda
            atualEsquerda++;
            //Decréscimo de 1 ao valor da variável atualDireita
            atualDireita--;
        }
    }
    //Uso da keyword return que fará o retorno do valor da variável atualEsquerda
    return atualEsquerda;
}
//Exibição do valor de retorno da função quickSort(args)
console.log(quickSort(listaLivros, 0, listaLivros.length - 1));
