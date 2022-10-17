//Média com forEach
//Declaração de variáveis a tribuição de valor e incialização
const notas = [10, 6.5, 8, 7.5];
let somaNotas = 0;
//Chamada do método .forEach(função), onde a função é declarada 
//como arrow function para encurtar a grafia
notas.forEach(nota => {
    somaNotas += nota;
})
//Declaração de variável e atribuição do resultado da expressão
//matemática
let media = somaNotas / notas.length;
//Exibição do valor da variável media
console.log(media);
