//Funções
//Declaração da função e escrita do bolo a ser executado
function imprimeTexto(texto){
    console.log(texto);
}

//Segunda declaração de função, porém com return
function soma(){
    return 2 + 2;
}

//Declaração de variável onde o valor da string será atribuído
let x = "Marcus";
//Chamada da função com o parâmetro que desejamos
imprimeTexto(x);

//Chamada da função "soma" dentro do console log
console.log(soma());

//Chamada da função "imprimeTexto" com a função "soma" como parâmetro
imprimeTexto(soma());
