//Script que validará o valor de input pelo usuário

//Função que validará o input do usuário com o valor da variável chute e retornará a mensagem e comportamento pertinente
function chutar(){
    //Declaração de variável e atribuição de valor constante, que será o limite de tentativas de inpu pelo usuário
    const limite = 3;
    //Incremento de 1 ao valor da variável rodada
    rodada++;

    //Declaração de variável e atribuição trechos de código HTML definidos pelos seletores dados pelo id no método
    let elementoInput = parseInt(document.getElementById('valor').value);   // Uso da propriedade .value para retorno do valor de input, convertido para int
    let elementoResultado = document.getElementById('resultado');
    let botao = document.getElementById('botao');

    //Condicional que validará o input do usuário, conforme a lógina pertinente
    if(rodada < limite && elementoInput == chute){
        //Injeção de string no cógigo HTML via propriedade da variável elementoResultado
        elementoResultado.innerHTML = 'Valor exato! Parabens!';
        //Injeção de código HTML via propriedade da variável elementoResultado
        botao.innerHTML = '<button type="submit" onclick="recarregar()" id="botao">Recarregar</button>';
    }else if(rodada === limite && elementoInput === chute){
        //Injeção de string no cógigo HTML via propriedade da variável elementoResultado
        elementoResultado.innerHTML = 'Valor exato! Parabens!';
        //Injeção de código HTML via propriedade da variável elementoResultado
        botao.innerHTML = '<button type="submit" onclick="recarregar()" id="botao">Recarregar</button>';
    }else if(rodada < limite && elementoInput != chute){
        //Condicional que validará se o valor da variável elementoInput está fora do range esperado
        if (elementoInput == NaN || elementoInput > 10 || elementoInput < 0){
            //Injeção de string no cógigo HTML via propriedade da variável elementoResultado
            elementoResultado.innerHTML = 'Valor errado!<br>Insira um valor entre 0 e 10!'
        }else{
            //Declaração de variável e atribuição de valor inicial
            let out = '';

            //Condicional que validará se o valor da variável elementoInput é maior ou menor que o valor da variável chute, e atribuirá ao valor da variável out a string pertinente
            if(elementoInput > chute){
                out = "O número é menor!";
            }else{
                out = "O número é maior!"
            }
            //Injeção de string no cógigo HTML via propriedade da variável elementoResultado concatenado com o valor da variável out
            elementoResultado.innerHTML = "ERRROOOOOU! " + out;
        };
    }else{
        //Injeção de string concatenada no cógigo HTML via propriedade da variável elementoResultado concatenado com o valor da variável chute
        elementoResultado.innerHTML = "Acabaram as chances. O número era " + chute + "!";
        //Injeção de código HTML via propriedade da variável elementoResultado
        botao.innerHTML = '<button type="submit" onclick="recarregar()" id="botao">Recarregar</button>';
    };
};

//Declaração de função que fará o recarregamento da página HTML
function recarregar(){
    //Método o objeto location que fará o recarregamento da página HTML
    location.reload();
}

//Declarçaão de variáveis e atrubuição de valor de inicialização
let chute = parseInt(Math.random() * 11)
let rodada = 0;
//Exibição concatenado do valor da variável chute, para uso em debug
console.log("chute = " + chute);
