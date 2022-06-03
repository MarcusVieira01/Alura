//Script para exibição de uma conversão de temperaturas em arquivo index.html

//Declaração de função que converterá a temperatura em °C para °F, K e R
function converter(){
    //Declaração de variável, captura do elemento retornado pelo método e atribuição do valor via atributo value, sendo convertido para float via método
    let elementoInput = parseFloat(document.getElementById('valorInput').value);
    //Declaração de variáveis
    let convertidoF, convertidoK, convertidoR;
    //Declaração de variáveis e atribuição do valor de retorno dos métodos, que capturarão os elementos dos ID específicos do arquivo index.html
    let elementoF = document.getElementById('f');
    let elementoK = document.getElementById('k');
    let elementoR = document.getElementById('r');
    //Conversão
    convertidoF = ((elementoInput * (9/5)) + 32).toFixed(2);
    convertidoK = (elementoInput + 273.15).toFixed(2);
    convertidoR = ((elementoInput * (9/5) + 491.67)).toFixed(2);
    //Escrita dos valores das variáveis convertidoF, convertidoK e convertidoR nos elementos do arquivo index.html dado pelas variáveis elementoF, elementoK e elementoR
    elementoF.setAttribute('value', convertidoF + '°F');
    elementoK.setAttribute('value', convertidoK+ ' K');
    elementoR.setAttribute('value', convertidoR + ' R');
};
