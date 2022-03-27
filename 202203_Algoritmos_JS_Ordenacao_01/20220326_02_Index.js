//Primeiro problema
//Importação de módulo externo com método require.(local)
const livros = require('./20220326_02_Exibindo_livros')
//Declaração de variável e atribuição do valor de 
//inicialização
let menor = 0;
//Loop for que varrerá o array de objetos Livros
for (let atual = 0; atual < livros.length; atual++) {
    //Condicional simples que atribuirá o índice do elemento na
    //variável menor quando o teste lógico for True
    if(livros[atual].preco < livros[menor].preco){
        menor = atual;
    }
}
//Exibição dos valores das chaves preco e titulo. O valor da
//variável menor definirá qual objeto será evocado de dentro da
//array de objetos, sendo seu valor o índice do elemento desta
//array
console.log(`O livro mais barato custa ${livros[menor].preco} e o título é ${livros[menor].titulo}.`);
