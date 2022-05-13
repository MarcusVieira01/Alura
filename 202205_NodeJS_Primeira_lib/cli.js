//
//Importação de módulo externo
const pegaArquivo = require('./20220510_Index');
//Declaração de variável que recebera o retorno do método process.argv
const caminho = process.argv;
//Exibição do retorno da função pegaArquivo, com parâmetro sendo o valor do elemento de índice 2 do array contido no valor da variável caminho
console.log(pegaArquivo(caminho[2]));
