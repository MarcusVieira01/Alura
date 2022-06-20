//Script que fará a leitura do input do usuário, validará se a URL está dentro da especificação necessária e injetará no código HTML do arquivo index.html da URL para exibição da imagem. A cada input, serão acumuladas as imagens. Caso haja falha na URL, será exibida mensagem ao usuário e no console

//Função que capturará os trechos de códigos HTML via seletor ID e fará a validação do conteúdo inserido pelo usuário. Caso true chamará a função listarFilmes(). Caso false será exibia mensagem ao usuário e no console
function adicionarFilme() {
    //Declaração de variáveis e atribuição da captura de trecho de código HTML, do arquivo index.html, pelo seletor ID específico
    let campoFilme = document.getElementById('filme').value;
    let campoLista = document.getElementById('listaFilmes');
    //Condicional que validará se a ULS inserida pelo usuário contem as extensões .jpg ou .png
    if(campoFilme.endsWith('.jpg') || campoFilme.endsWith('.png')){
        //Evocação da função listarFilmes(arg, arg)
        listarFilmes(campoFilme, campoLista);
    }else{
        //Captura de trecho de código HTML, do arquivo index.html, pelo seletor ID específico
        document.getElementById('filme').value = "Deu Ruim. Não achei a foto!";
        //Exibição de mensagem de erro customizada
        console.error("Erro0001: URL sem .jpg ou .png!");
    };
  };

//Função que injetará uma tag HTML para cada input do usuário no arquivo index.html
function listarFilmes(url, lista){
  //Declaração de variável e atribuição de tag HTML concatenada com o valor do argumento url
  let elementoFilme = "<img src=" + url + ">";
  //Injeção via método .innerHTML do objeto lista, sendo argumento passado na evocação da função
  lista.innerHTML = lista.innerHTML + elementoFilme;
  //Método que atritui o valor da string vazia ao valor do elemento HTML dado pelo seletor ID
  document.getElementById('filme').value = "";
}
  