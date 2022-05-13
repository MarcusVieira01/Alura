//Programa que fará a leitura de um arquivo com extensão markdown, buscará todas as URL que o arquivo possuir, com seus títulos
//Declaração de variáveis e atribuição do valor de retorno do método require(args) que fará o carregamento dos módulos externos
const chalk = require('chalk');
const fs = require('fs');//Módulo File Sistem

//Declaração de função que extrairá uma cadeia de caracteres de uma string conforme definido pela lógida das expressões regulares
function extraiLinks(texto){
    //Declaração de variável e atribuição dos metacaracteres definidos para a expressão regular
    const regex = /\[([^\]]*)\]\((https?:\/\/[^$#\s].[^\s]*)\)/gm;
    //Declaração de variáveis que acumulará o retorno do método rexeg.exec(args) e uma variável temporária
    const arrayResultados = [];
    let temp;
    //Loop while que executará o bloco enquanto a variável temp não receber o valor null do método regex.exec(texto)
    while((temp = regex.exec(texto)) !== null){
        //O método array.push() coloca um novo elemento no array onde seu parâmetro será dado para criação de um novo objeto
        arrayResultados.push({[temp[1]]: temp[2]});
    };
    //Retorno do valor da variável arrayResultados via keyword return, usando um condicional ternário para retornar a ausência de links ou retornar o array 
    return arrayResultados.length === 0 ? 'Não há links.' : arrayResultados;
};

//Declaração de função que fará o tratamento de erro dentro da função pegaArquivo(args)
function trataErro(erro){
    throw new Error(chalk.red(erro.code, 'Faiô'));
};

//Declaração de função que fará a exibição do conteúdo de um arquivo usando método da biblioteca FS de forma assíncrona usando as keywords asyn e await, usando o método chalk.blue(par) para colorir o texto
async function pegaArquivo(caminhoArquivo){
    //Declaração de variável que receberá a string com a codificação do texto const encoding = 'utf-8';
    const encoding = 'utf-8';
    //Bloco try que fará a tentativa de execuçãocaso haja erro a eyword catch capturará o erro fará o callback da função trataErro. Caso true o bloco será executado em sua totalidade
    try{
        //Decalaração de variável onde será atribído o valor de retorno do métofo fs.promises.readFile(args) de forma assíncrona
        const texto = await fs.promises.readFile(caminhoArquivo, encoding);
        //Exibição do valor da variável texto, colorido via método chalk.green(arg)
        return(extraiLinks(texto));
    } catch(erro){trataErro(erro)};
};

//Exportação da função pergaArquivo como módulo
module.exports = pegaArquivo;

//COMENTADO PARA UTILIZAÇÃO DE OUTRO EXEMPLO
//Evoca a função pegaArquivo(path)
//pegaArquivo('./texto.md');

//COMENTADO PARA UTILIZAÇÃO DE OUTRO EXEMPLO
// //Declaração de função que fará a exibição do conteúdo de um arquivo usando método da biblioteca FS de forma assíncrona usando o método promises e usando o método chalk.blue(par) para colorir o texto
// function pegaArquivo(caminhoArquivo){
//     //Declaração de variável que receberá a string com a codificação do texto
//     const encoding = 'utf-8';
//     //Método encadeado que fará a leitura do texto via promessa
//     fs.promises
//     .readFile(caminhoArquivo, encoding)
//     .then((texto) => console.log(chalk.blue(texto)))
//     .catch((erro) => trataErro(erro));
// }

//COMENTADO PARA UTILIZAÇÃO DE OUTRO EXEMPLO
// //Declaração de função que fará a exibição do conteúdo de um arquivo usando métoo da biblioteca FS, usando o método chalk.green(par) para colorir o texto
// function pegaArquivo(caminhoArquivo){
//     //Declaração de variável que receberá a string com a codificação do texto
//     const encoding = 'utf-8';
//     fs.readFile(caminhoArquivo, encoding, (erro, texto) => {
//         if(erro){
//             trataErro(erro);
//         }
//         console.log(chalk.green(texto));
//     })
// }