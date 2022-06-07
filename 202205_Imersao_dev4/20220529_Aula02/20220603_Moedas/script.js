//Script para resposta da chamada pelo arquivo index.html via onclick para conversão de moedas com acesso aos dados de uma API externa

//Declaração de função que fará a requisição de dados a uma API via url e retornará seus dados convertidos para JSON
function fazGetJson(url){
    //Instanciamento de novo objeto para que seja realizada a requisição de dados
    let request = new XMLHttpRequest();
    //Evocação de método para aquisição de dados da API, com argumentos GET para captura de dados, a url a ser acessada e a flag de sincronicidade false
    request.open("GET", url, false);
    //Evocação de método de envio de informações, que no caso consta penas para finalizar o processo;
    request.send();
    //Retorno do valor da propriedade responseText do objeto response, após conversão para JSON via método
    return JSON.parse(request.responseText);
}

//Declaração de função que será chamada pela propriedade onclick no arquivo index.html
function converter(){
    //Declaração de variáveis e atribuição do valor de string sendo a URL da API a ser acessada e o retorno da função fazGetJason(url)
    let url = 'https://economia.awesomeapi.com.br/last/USD-BRL,BTC-USD';
    let retornoAPI = fazGetJson(url);
    //Exibe no console os objetos retornados
    console.log(retornoAPI)

    //Declaração de variáveis e atribuição dos valores de retorno das propriedades do objeto retornoAPI
    let taxaUSDBRL = parseFloat(retornoAPI.USDBRL.ask).toFixed(2); //Taxa de 1 dolar para reais na venda
    let taxaBTCUSD = parseFloat(retornoAPI.BTCUSD.ask).toFixed(2); //Taxa de 1 BTC para USD na venda
    let instanteConsulta = retornoAPI.USDBRL.create_date;

    //Declaração de variável e atribuição do valor de retorno do método
    let valorDollar = document.getElementById("valorDollar").value;

    //Declaração de variável e atribuição dos valores de retorno das expressões matemáticas, com quantidade de casas decimais ficxa via método. Conversões das moedas
    let convertidoUSDBRL = (taxaUSDBRL * valorDollar).toFixed(2); //USD -> BRL
    let convertidoUSDBTC = ((1 / taxaBTCUSD) * valorDollar).toFixed(3); //USD -> BTC
    
    //Declaração de variável e atribuição concatenada dos valores das variáveis instanteConsulta, convertidoUSDBRL e convertidoUSDBTC. O valor total será utilizado na injeção ao código HTML
    let saida = 'Atualização dos dados em:' + '<br>'
                + instanteConsulta + '<br><br>' + 
                'Valor em Real: R$' + convertidoUSDBRL + '<br>' +
                'Valor em Bitcoin: BTC ' + convertidoUSDBTC;

    //Declaração de variável e atribuição da captura do trecho de código HTML5 via método
    let elementoConvertido = document.getElementById('valorConvertido');
    //Inserção do valor da variável valorEmReal no trecho de código HTML5 usando o método .innerHTML
    elementoConvertido.innerHTML = saida;
};
