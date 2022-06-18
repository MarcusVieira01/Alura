
function exibe(){
    let listaFilmes = ['https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_.jpg',
                        "https://images-na.ssl-images-amazon.com/images/I/91382RVTr3L.jpg", 
                        "https://upload.wikimedia.org/wikipedia/pt/6/61/TronLegacy.jpg",
                        'https://i.pinimg.com/474x/17/e1/44/17e144b2e0e49c835fb4092321fefeea.jpg'];

    let elementoImagens = document.getElementById('imagens');
    let elementoBotao = document.getElementById('botao')
    let insere = "";

    for (let i = 0; i < listaFilmes.length; i++) {
        console.log("iteração" + i);
               
        insere = insere + "<img src=" + listaFilmes[i] + "> ";

        elementoImagens.innerHTML = insere;
        
        console.log(insere);
    };
    
    elementoBotao.style.display = 'none'; //Botão não é exibido
    //elementoBotao.disabled = true; //Botão fica desabilitado
}
