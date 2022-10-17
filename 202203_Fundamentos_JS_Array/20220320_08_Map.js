//Uso do método .map()
//Declaração de variável com atribuição do valor sendo uma array
const notas = [10, 9, 8, 7, 6];
//Declaração de variável e atribuioção do retorno do método 
//.map(function) onde a função é uma arrow function e o condicional
//foi usado um operador ternário
const notasAtual = notas.map( nota => nota == 10 ? nota : ++nota)
//Exibição do valor da variável NotasAtual
console.log(notasAtual);
