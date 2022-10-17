//Arquivo que fará a interface con o console
//Importação de módulos externos
const chalk = require('chalk');
const pegaArquivo = require('./20220510_Index');
const validaURL = require('./20220513_http_valid');

//Declaração de variável que recebera o retorno do método process.argv, sendo um array com os caminhos que o arquivo percorre e o valor do input pelo usuário
const caminho = process.argv;

// Declaração de função assincrona que fará a chamada da função pegaArquivo passando um caminho como parâmetro, onde essa função é uma promessa
async function processaTexto(caminhoArquivo){
    //Declaração de variável e atribuição do retorno do método pegaArquivo(args), que se torna uma promessa por ter a keyword await usada
    const resultado = await pegaArquivo(caminhoArquivo[2]);
    //Condicional que verifica se o usuário inseriu o termo validar na chamada do arquivo
    if(caminho [3] === 'validar'){
        //Caso true, será evocada a função validaURL(args) e exibido o seu retorno de forma formatada e colorida com chalk
        console.log(chalk.yellow('links validados'), await validaURL(resultado));
    }else{
        //Caso false, será exibido o valor da variável resultado de forma formatada e colorida com chalk
        console.log(chalk.yellow('Lista de links'), resultado);
    }
}

//Evocação da função processaTexto, com parâmetro sendo o valor da variável caminho
processaTexto(caminho);
