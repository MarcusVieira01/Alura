//Script que realiza a chamada de método randômico e comparar o esse valor de retorno com o input do usuário

//Declaração de função que será evocada via botão no arquivo html, realizará a aquisição de trechos do código do mesmo arquivo, comparará o valor de input pelo usuário
function chutar() {
  //Declaração de variáveis e atribuição do trecho de código HTML retornado pelo método, onde o trecho é identificado pelo seletor ID
    let chute = parseInt(document.getElementById("valor").value); //Com a propriedade.value, é retornado o valor do id
    let elementoResultado = document.getElementById('resultado'); 

    //Condicional aninhado e composto onde será inserida a String no trecho de código HTM pertinente
    if (chute < 0 || chute > 10) {
      elementoResultado.innerHTML = "Numero fora do range";
    } else if (chute === numeroSecreto) {
      elementoResultado.innerHTML = "Acertou!";
    } else {
      elementoResultado.innerHTML ="ERRRRRRROU!";
    };
  };
  
  //Declaração de variável e atribuição do valor randômico de retorno do método, multiplicado por uma constante e convertido em int
  let numeroSecreto = parseInt(Math.random() * 11);
  //Exibição do valor da variável numerSecreto
  console.log(numeroSecreto);
  