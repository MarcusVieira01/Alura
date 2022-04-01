//Implementação do algoritmo merge sort
//
const listaLivros = require('./20220331_01_Array');
//
function mergeSort(array){
    //
    if(array.length > 1){
        //
        const meio = Math.floor(array.length / 2);
        const parte1 = mergeSort(array.slice(0, meio));
        const parte2 = mergeSort(array.slice(meio, array.length));
        //
        array = ordena(parte1, parte2);


    }
    return array;
}
//
function ordena(parte1, parte2){
    //
    let posAtualParte1 = 0;
    let posAtualParte2 = 0;
    const resultado = [];
    //
    while(posAtualParte1 < parte1.length && posAtualParte2 < parte2.length){
        //
        let prodAtualParte1 = parte1[posAtualParte1];
        let prodAtualParte2 = parte2[posAtualParte2];
        //
        if(prodAtualParte1.preco < prodAtualParte2.preco){
            //Método array.push(par) que incrementará após o último elemento do array, o valor do elemento do parâmetro
            resultado.push(prodAtualParte1);
            //
            posAtualParte1++;
        //
        }else{
            //
            resultado.push(prodAtualParte2);
            //
            posAtualParte2++;
        }
    }
    //
    return resultado.concat(posAtualParte1 < parte1.length
    ? parte1.slice(posAtualParte1)
    : parte2.slice(posAtualParte2))
}
//
console.table(mergeSort(listaLivros))
