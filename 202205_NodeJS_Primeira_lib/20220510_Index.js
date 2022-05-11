//
//Declaração de variáveis e atribuição do valor de retorno do método require(args) que fará o carregamento dos módulos externos
const chalk = require('chalk');
const fs = require('fs');//Módulo File Sistem

//
const texto = 'A interface File provê informações sobre arquivos e permite ao JavaScript  a acessar seu conteúdo. São geralmente recuperados a partir de um objeto [FileList](https://developer.mozilla.org/pt-BR/docs/Web/API/FileList) que é retornado como resultado da seleção, pelo usuário, de arquivos através do elemento [<input>](https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element/Input), a partir do objeto [DataTransfer](https://developer.mozilla.org/pt-BR/docs/Web/API/DataTransfer) utilizado em operações de arrastar e soltar, ou a partir da API `mozGetAsFile()` em um [HTMLCanvasElement](https://developer.mozilla.org/pt-BR/docs/Web/API/HTMLCanvasElement). Em Gecko, códigos com privilégiios podem criar objetos File representando qualquer arquivo local sem a intereção do usuário (veja [Implementation notes](https://developer.mozilla.org/pt-BR/docs/Web/API/File#implementation_notes) para mais informações.)'

//Declaração de função que extrairá uma cadeia de caracteres de uma string conforme definido pela lógida das expressões regulares
function extraiLinks(texto){
    //Declaração de variável e atribuição dos metacaracteres definidos para a expressão regular
    const regex = /\[([^\]]*)\]\((https?:\/\/[^$#\s].[^\s]*)\)/gm;
    //Declaração de variáveis que acumulará o retorno do método rexeg.exec(args) e uma variável temporária
    const arrayResultados = [];
    let temp;
    //
    while((temp = regex.exec(texto)) !== null){
        //O método array.push() coloca um novo elemento no array onde seu parâmetro será dado para criação de um novo objeto
        arrayResultados.push({[temp[1]]: temp[2]})
    };
    //Exibição do valor da variável arrayResultados
    console.log(arrayResultados);
}
//Evoca a função extraiLinks(args)
extraiLinks(texto);

//Declaração de função que fará o tratamento de erro dentro da função pegaArquivo(args)
function trataErro(erro){
    throw new Error(chalk.red(erro.code, 'Faiô'));
};

// //Declaração de função que fará a exibição do conteúdo de um arquivo usando método da biblioteca FS de forma assíncrona usando as keywords asyn e await, usando o método chalk.blue(par) para colorir o texto
// async function pegaArquivo(caminhoArquivo){
//     //Declaração de variável que receberá a string com a codificação do texto const encoding = 'utf-8';
//     const encoding = 'utf-8';
//     //Bloco try que fará a tentativa de execuçãocaso haja erro a eyword catch capturará o erro fará o callback da função trataErro. Caso true o bloco será executado em sua totalidade
//     try{
//         //Decalaração de variável onde será atribído o valor de retorno do métofo fs.promises.readFile(args) de forma assíncrona
//         const texto = await fs.promises.readFile(caminhoArquivo, encoding);
//         //Exibição do valor da variável texto, colorido via método chalk.green(arg)
//         console.log(chalk.green(texto));
//     } catch(erro){trataErro(erro)};
// };

// //Evoca a função pegaArquivo(path)
// pegaArquivo('./texto.md');



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