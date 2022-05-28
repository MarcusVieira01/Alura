//Arquivo que fará o cálculo da média e exibirá via caixa de diálogo

//Declaração de função que receberá 4 parâmetros, fará o cálculo da média atribuindo o valor de resultado à variável notaFinal e exibirá o valor dessa variável com a quantidade de casas decimais definida pelo método.toFIxed(args)
function calcMedia(nt1, nt2, nt3, nt4){
    //Declaração de variável local e atribuição do valor de inicialização
    let passou = '';
    //Declaração de variável e atribuição do valor de resultado da expressão matemática
    let notaFinal = (nt1 + nt2 + nt3 + nt4) / 4;
    //Declaração de condicional que testará o valor da variável notaFinal e atribuirá o valor String pertinente
    if(notaFinal >= 6.0){
        passou = 'Aprovado!'
    }else{
        passou = 'Reprovado!'
    };

    //Exibição em caixa de diálogo via método alert(args), concatenando uma mensagem com o valor da variável notaFinal onde a quantidade de casas decimais ficada via método .toFixed(args)
    alert("Sua média foi: " + notaFinal.toFixed(2) + " e está " + passou);
};

//Declaração de função que chamará a função calcMedia quando o usuário clicar no botão da página index.html 
function show(){
    //Evocação da função calcMedia atribuindo as variáveis notaPrimeiroBimestre, notaSegundoBimestre, notaTerceiroBimestre e notaQuartoBimestre nos parâmetros
    calcMedia(notaPrimeiroBimestre, notaSegundoBimestre, notaTerceiroBimestre, notaQuartoBimestre);
};

//Declaração de variáveis e atribuição dos valores de inicialização
let notaPrimeiroBimestre = 9.0;
let notaSegundoBimestre = 7.5;
let notaTerceiroBimestre = 8.0;
let notaQuartoBimestre = 2.0;
