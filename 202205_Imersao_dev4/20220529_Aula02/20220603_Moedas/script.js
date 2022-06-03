//Script para resposta da chamada pelo arquivo index.html via onclick para conversão de moedas

//Declaração de função que será chamada pela propriedade onclick no arquivo index.html
function converter(){
    //Declaração de variáveis e atribuição dos valores de inicialização
    let taxaDollar = 4.73;
    let taxaBtc = 0.0000033;
    //Declaração de variável e atribuição da captura do trecho de código HTML5 via método
    let elementoConvertido = document.getElementById('valorConvertido');
    //Declaração de variável e atribuição do valor de retorno do método
    let valorDollar = document.getElementById("valorDollar").value;
    //
    let valorDolReal = (parseFloat(valorDollar) * taxaDollar).toFixed(2);
    let valorDolBTC = (parseFloat(valorDollar) * taxaBtc).toFixed(7);
    //
    let valorEmReal = "Valor em Reais: R$" + valorDolReal + "<br>" + "Valor de Reais em BTC: BTC " + valorDolBTC;
    //Insersão do valor da variável valorEmReal no trecho de código HTML5 usando o método .innerHTML
    elementoConvertido.innerHTML = valorEmReal;
};
