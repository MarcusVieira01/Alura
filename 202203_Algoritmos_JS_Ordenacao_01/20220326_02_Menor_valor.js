//Primeiro problema
//Importação de módulo externo com método require.(local)
// const livros = require('./20220326_02_Exibindo_livros');
//
function menorValor(arrProdutos, inicial){
    //Declaração de variável e atribuição do valor de 
    //inicialização
    let menor = inicial;
    //Loop for que varrerá o array de objetos Livros
    for (let atual = inicial; atual < arrProdutos.length; atual++) {
        //Condicional simples que atribuirá o índice do elemento na
        //variável menor quando o teste lógico for True
        if(arrProdutos[atual].preco < arrProdutos[menor].preco){
            menor = atual;
        }
    }
    //Retorna o valor da variável menor que será o índice/posição
    //do item mais barato
    return menor;
}
// //Exibição dos valores das chaves preco e titulo. O valor da
// //variável menor definirá qual objeto será evocado de dentro da
// //array de objetos, sendo seu valor o índice do elemento desta
// //array
// console.log(`O livro mais barato custa ${livros[menor].preco} e o título é ${livros[menor].titulo}.`);
//Propriedade module.exports que fará a função menorValor ser acessada externamente
module.exports = menorValor;
