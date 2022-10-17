//Filtrando elementos de uma array
//Declaração de variáveis e atribuição de valor sendo arrays
const nomes = ['Ana', 'Marcos', 'Maria', 'Mauro'];
const notas = [7, 4.5, 8, 7.5];
//Declaração de vari ável e atribuição do valor de retorno do 
//método .filter(function) usando uma arrow function
const reprovados = nomes.filter((_, indice) => 
notas[indice] < 5);
//Exibição dos valores da variável reprovados via template string
console.log(`Reprovados ${reprovados} `);
