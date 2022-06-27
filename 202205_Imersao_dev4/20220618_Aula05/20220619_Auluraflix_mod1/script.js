//Script que insere e exclui a imagem, dado por uma url, e o nome

/*Função que captura trechos de código HTML do arquivo index.html, valida o input da URL e trata conforme caso: 
1. Injeta o valor do input do usuário, pós tratamento, noa rquivo index.html; 
2. Informa no console que houve erro quando campo vazio; 
3. Informa no console e no campo de input caso a url não possua extensões .jpg ou .png*/
function adicionarFilme(){
    //Declaração de variável e atribuição do trecho de código html capturado via método, com seletor ID específico
    let url = document.getElementById('filmeInput').value;
    let nome = document.getElementById('nomeInput').value;
    //Condicional que validará a url inserida pelo usuário e tratará conforme o caso
    if((url.endsWith('.jpg') || url.endsWith('.png')) && (nome !== '')){
        //Inclusão do valor da variável url e nome ao valor do elemento no objeto array listaUrl e listaNome via método
        listaUrl.push(url);
        listaNome.push(nome);
        //Atribuição de valor vazio no elemento dado pelo seletor ID, no campo value
        document.getElementById('filmeInput').value = '';
        document.getElementById('nomeInput').value = '';
    }else if(url === "" || nome === ""){
        //Exibição de mensagem no formato de erro
        console.error('Erro 001: Um campo está vazio');
    }else{
        //Exibição de mensagem no formato de erro
        console.error('Erro 002: URL sem .jpg ou .png');
        //Atribuição de valor no elemento dado pelo seletor ID, no campo value
        document.getElementById('filmeInput').value = 'URL sem extensão .jpg ou .png';
    };
    //Evocação do método iteraLista(arg) para que seja iterada o objeto array lista
    iteraLista(listaUrl, listaNome);
};

//Função que percorre a lista e injeta cada valor do elemento no arquivo index.html
function iteraLista(listaUrl, listaNome){
    //Declaração de variáveis e atribuição do trecho de código html capturado via métood, com seletor ID específico
    let elementoUrl = document.getElementById('listaFilmes');
    let elementoNome = document.getElementById('nome');
    //Injeção de valor vazio no código HTML via método, para inicialização limpa no loop
    elementoUrl.innerHTML = '';
    elementoNome.innerHTML = '';
    //Loop for que varrerá os índices da listaUrl e injetará o código HTMl pertinente, sobre a listaUrl e listaNome
    for(let i = 0; i < listaUrl.length; i++){
        //Declaração de variáveis e concatenação de tag HTML com o valor da variável url
        let tagUrl = '<img src=' + listaUrl[i] + ' alt="filme">';
        let tagNome = '<p>' + listaNome[i] + '</p>';
        //Injeção de código HTML no arquivo index.html
        elementoUrl.innerHTML = elementoUrl.innerHTML + tagUrl;
        elementoNome.innerHTML = elementoNome.innerHTML + tagNome;
    };
};

//Função que removerá um filme inserido
function apagaFilme(){
    //Declaração de variável e atribuição do trecho de código html capturado via método, com seletor ID específico
    let url = document.getElementById('filmeInput').value;
    let nome = document.getElementById('nomeInput').value;
    //Declaração de variáveis e atribuição do valor de retorno do método
    let posUrl = listaUrl.indexOf(url);
    let posNome = listaNome.indexOf(nome);
    //Condicional que validará o valor das variáveis posUrl e posNome
    if((posUrl !== -1) && (posNome !== -1)){
        //Apagar
        listaUrl.splice(url, 1);
        listaNome.splice(nome, 1);
        //Evocação do método iteraLista(arg) para que seja iterada o objeto array lista
        iteraLista(listaUrl, listaNome);
        //Atribuição de valor vazio no elemento dado pelo seletor ID, no campo value
        document.getElementById('filmeInput').value = '';
        document.getElementById('nomeInput').value = '';
    }else if(url === "" || nome === ""){
        //Exibição de mensagem no formato de erro
        console.error('Erro 001: Um campo está vazio');
    }else{
        //Atribuição de valor no elemento dado pelo seletor ID, no campo value
        document.getElementById('filmeInput').value = 'Filme não encontrado!';
        document.getElementById('nomeInput').value = 'Nome não encontrado!';
    };
    
};

//Declaração de variáveis globais, do tipo array, para uso na função adicionarFilmes() e iteraLista(arg, arg)
let listaUrl = [];
let listaNome = [];
