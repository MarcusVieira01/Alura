//Arquivo que realizará a validação dos links
//Importação de módulos externos
const fetch = require('node-fetch');

//Declaração de função que lançara os erros recebidos via parãmetro para que a keyword catch(args) consiga capturar
function manejaErros(erro){
    //Uso da keyword trow par alançar os erros encontrados no instanciamento do objeto Error
    throw new Error(erro.mensage);
}

//Declaração de função assíncrona que fará a checagem do status de cada link do array de parâmetro
async function statusCheck(arrayURL){
    //Uso da keyword try que tentará executar o bloco de código abaixo, que no caso false atingirá a keyword try
    try{
        //Declaração de variável que receberá, via atribuição, o valor de retorno do médoco, como promessa, Promise.all(promises). Seu argumento é uma arrow function que retornará o status de cada URL, via método fetch(url)
        const arrayStatus = await Promise
        .all(arrayURL
            .map(async url => {
                //Declaração de variável que recebera, via atribuição, o valor de retorno do método, que é uma promessa, fetch(url)
                const response = await fetch(url);
                //Uso da keyword return para retornar o valor do status via propriedade response.status, pois é atribuído em response um objeto advindo do método fetch(url)
                return response.status;
        }));
        //Uso da keyword return para retornar o valor da variável arrayStatus
        return arrayStatus;
    } catch(erro){//Uso da keyword catch(par) que fará a captura do erro e evocarã a função manejaErro para tratar o erro
        //Evocação da função manejaErros(par)
        manejaErros(erro);
    }
}

//Declaração de função que gerará a lista de links a serem validados
function geraListaURL(arrayLinks){
    //Uso da keyword return retornará o valor da arrow function
    return arrayLinks
        .map(objetoLink => Object
            .values(objetoLink).join());
}

//Declaração de função que validará os url's conforme status de retorno
async function validaURL(arrayLinks){
    //Declaração de variável onde é atribuído o valor de retorno da ufunção geraListaURL(array)
    const links = geraListaURL(arrayLinks);
    //Declaração de variável onde é atriuído o valor de retorno, via promessa, da função statusCheck(array)
    const statusLinks = await statusCheck(links);
    //
    const resultados = arrayLinks.map((objeto, indice) => ({
        ...objeto, 
        status: statusLinks[indice]
    }));
    return resultados;
}

//Exportação da função validaURL como módulo
module.exports = validaURL;
