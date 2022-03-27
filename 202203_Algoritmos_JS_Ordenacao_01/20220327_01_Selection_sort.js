//Selection Sort
//Carregamento de módulo externo
const livros = require('./20220326_02_Exibindo_livros');
const menorValor = require('./20220326_02_Menor_valor');
//Exibição tabulada do array de objetos livros, antes da ordenação
console.table(livros);
//Loop for que varrerá o array de objetos livros
for(let atual = 0; atual < livros.length; atual++){
    //Declaração de variáveis que registrarão os dados retornos
    let menor = menorValor(livros, atual);
    let livroAtual = livros[atual];
    let livroMenorPreco = livros[menor];
    //Atribuição de valores para que o array de objetos livros seja reordenado
    livros[atual] = livroMenorPreco;
    livros[menor] = livroAtual;
}
//Exibição tabulada do array de objetos livros, após ordenação
console.table(livros);
