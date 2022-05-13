//Arquivo que fará a interface con o console
//Importação de módulos externos
const chalk = require('chalk');
const pegaArquivo = require('./20220510_Index');
//Declaração de variável que recebera o retorno do método process.argv, sendo um array com os caminhos que o arquivo percorre e o valor do input pelo usuário
const caminho = process.argv;
// Declaração de função assincrona que fará a chamada da função pegaArquivo passando um caminho como parâmetro, onde essa função é uma promessa
async function processaTexto(caminhoArquivo){
    const resultado = await pegaArquivo(caminhoArquivo[2])
    console.log(chalk.yellow('Lista de links'), resultado);
}
//Evocação da função processaTexto, com parâmetro sendo o valor da variável caminho
processaTexto(caminho);
