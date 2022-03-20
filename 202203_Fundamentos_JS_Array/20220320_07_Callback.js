//Funções Callback
//Declaração de função
function imprimeNomes(nome){
    console.log(nome)
}
//Declaração de variável com valor atribuído sendo uma array
const nomes =['Ana', 'Ju', 'Leo', 'Paula'];
//Chamada do método .forEach(function) onde é usada a função 
//imprimeNomes, com parâmetro omitido, como callback
nomes.forEach(imprimeNomes);
