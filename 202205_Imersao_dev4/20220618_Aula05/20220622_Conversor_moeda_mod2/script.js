//Script que converterá o valor da moeda selecionada para Real, com taxa de conversão atualizada no momento da conversão via Awesome API 

//Função que acessará a API Awesome, requisitará os dados atuais sobre as moedas USD e EUR perante ao BRL e BTC perante ao USD e fará a tribuição dos valores dos elementos específicos no array listaTaxas. Via botão no arquivo index.html
function atualizaApi(){
    //Declaração de variável e atribuição de valor vazio de inicialização
    let listaTaxas = [];

    //Declaração de constante com o valor da URL da API que a função acessará
    const url = 'https://economia.awesomeapi.com.br/last/USD-BRL,BTC-USD,EUR-BRL'
    
    //Instanciamento de novo objeto para que seja realizada a requisição de dados
    let request = new XMLHttpRequest();
    //Evocação de método para aquisição de dados da API, com argumentos GET para captura de dados, a url a ser acessada e a flag de sincronicidade false
    request.open('GET', url, false);
    //Evocação de método de envio de informações, que no caso consta penas para finalizar o processo
    request.send();
    //Retorno do valor da propriedade responseText do objeto response, após conversão para JSON via método
    const retorno = JSON.parse(request.responseText);

    //Atruibuição de novo elemento ao array listaTaxas via método, onde o valor atribuído é dado pelo retorno do elemento específico do objeto JSON, convertido para float e com a quantidade de casas decimais ficas em 2. A propriedade bid contém o valor de compra da aludida moeda
    listaTaxas.push(retorno.USDBRL.bid);
    listaTaxas.push(retorno.EURBRL.bid);
    listaTaxas.push(retorno.BTCUSD.bid);
    listaTaxas.push(retorno.USDBRL.create_date);

    //Retorno, via kewyword return, do array para utilização externa
    return listaTaxas;
};

//Declaração de função que fará a conversão da moeda desejada para real
function converte(){
    //Declaração de constante e atribuição do retorno da função atualizaApi()
    const lista = atualizaApi();
    //Declaração de variável e atribuição de valor de inicialização
    let real = 0;

    //Declaração de constante e atribuição do valor de retorno do método que capturará o valor do elemento HTML dado pelo seletor ID específico. Valor este convertido para float via método
    const valorInput = parseFloat(document.getElementById('valorInput').value);
    //Declaração de constante que receberá o valor de retorno do método onde será tribuído apenas o valor do radio button selecionado no documento index.html
    const moeda = document.querySelector('input[name="from"]:checked').value;
    //Declaração de constante e atribuição da captura de código HTML via método e trecho dado via seletor ID específico
    const elementoDataHora = document.getElementById('dataHora');
    const elementoOutput = document.getElementById('valorOutput');

    //Condicional que =, dependendo do caso da comparação, fará a conversão para a moeda pertinente
    if(moeda === 'dollar'){
        //Declaração de constante e atribuição do valor do elemento de índice 0 do array lista
        const taxaDollar = lista[0];
        //Atribuição do valor de resultado da expressão matemática, com quantidade de casas fixa em 2 via método
        real = (valorInput * taxaDollar).toFixed(2);
        //Atribuição do valor da variável real ao elemento HTML capturado onde este valor será atribuído na propriedade velue
        elementoOutput.setAttribute('value', real);
    }else if(moeda === 'euro'){
        //Declaração de constante e atribuição do valor do elemento de índice 1 do array lista
        const taxaEuro = lista[1];
        //Atribuição do valor de resultado da expressão matemática, com quantidade de casas fixa em 2 via método
        real = (valorInput * taxaEuro).toFixed(2);
        //Atribuição do valor da variável real ao elemento HTML capturado onde este valor será atribuído na propriedade velue
        elementoOutput.setAttribute('value', real);
    }else if(moeda === 'btc'){
        //Declaração de constantes e atribuição dos valores dos elementos de índice 2 e 0 do array lista. Houve a necessidade de multiplicação por 1000 pois o retorno da API está multiplicando por 10^-3
        const taxaBTC_USD = lista[2] * 1000;
        const taxaDolar = lista[0];
        //Atribuição do valor de resultado da expressão matemática, com quantidade de casas fixa em 2 via método
        let real = ((valorInput * taxaBTC_USD) * taxaDolar).toFixed(2);
        //Atribuição do valor da variável real ao elemento HTML capturado onde este valor será atribuído na propriedade velue
        elementoOutput.setAttribute('value', real);
    }else{
        //Exibição de mensagem de erro se todas as comparações forem false
        console.error('Erro 0001: Deu merda na seleção da conversão!');
    };

    //Atribuição do valor do elemento de índice 3 do array lista ao elemento HTML capturado
    elementoDataHora.innerHTML = 'Data e hora da consulta à <a href="https://docs.awesomeapi.com.br/api-de-moedas" target="blank">Awesome API</a>: ' + lista[3];    
};

//Função que fará o arquivo index.html ser recarregado via chamado pelo botão no arquivo
function limpa(){
    //Método que executa o recarregamento do arquivo em que está em execução
    location.reload();
};
