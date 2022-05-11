//
//Declaração de variáveis e atribuição do valor de retorno do método require(args) que fará o carregamento dos módulos externos
const chalk = require('chalk');
const fs = require('fs');//Módulo File Sistem
//Declaração de função que fará a exibição do conteúdo de um arquivo usando métoo da biblioteca FS, usando o método chalk.green(par) para colorir o texto
function pegaArquivo(caminhoArquivo){
    const encoding = 'utf-8';
    fs.readFile(caminhoArquivo, encoding, (_, texto) => {console.log(chalk.green(texto))
    })
}
//Evoca a função pegaArquivo(path)
pegaArquivo('./texto.md')
