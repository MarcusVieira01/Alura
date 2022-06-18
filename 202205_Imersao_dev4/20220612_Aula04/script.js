//Script que varrerá um array e injetará o código HTML no arquivo index.html

//Declaração de função que varrerá o array listaFilmes e injetará cada elemento como tag HTML no arquivo index.html, no seletor especifico
function exibe(){
    //Delaração de array com as URLs de acesso
    let listaFilmes = ['https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_.jpg',
                        "https://images-na.ssl-images-amazon.com/images/I/91382RVTr3L.jpg", 
                        "https://upload.wikimedia.org/wikipedia/pt/6/61/TronLegacy.jpg",
                        'https://i.pinimg.com/474x/17/e1/44/17e144b2e0e49c835fb4092321fefeea.jpg'];

    //Declaração de variáveis e atribuição dos valores de retorno do método, que capturará o trecho de código HTML usando o seletor ID
    let elementoImagens = document.getElementById('imagens');
    let elementoBotao = document.getElementById('botao');
    //declaração de variável e atribuição de valor inciial
    let insere = "";

    //Loop for que varrerá o array listaFilmes e concatenará o valor de cada elemento, com índice dado pela variável de controle i, pra injeção no arquivo index.html
    for (let i = 0; i < listaFilmes.length; i++) {
        //Contatenação do valor do elemento de índice dado pela variável de controle i,               
        insere = insere + "<img src=" + listaFilmes[i] + "> ";
        //Injeção do valor da variável insere no trecho de código capturado e atribuído ao valor da variável elemento
        elementoImagens.innerHTML = insere;
        //Exibição concatenada do valor da variável i e exibição dov alor da variável insere, para fins de debug
        console.log("Iteração" + i);
        console.log(insere);
    };
    //Ocultação ou desabilitação do botão. A forma comentada não está em uso
    elementoBotao.style.display = 'none'; //Botão não é exibido
    //elementoBotao.disabled = true; //Botão fica desabilitado
};
