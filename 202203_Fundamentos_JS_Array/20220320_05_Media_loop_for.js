//Média com loop for
//Declaração de variáveis e atribuição dos valores da lista
//e inicialização
const notas = [10, 6.5, 8, 7.5];
let soma = 0;
//Loop for que fará a soma de todas as notas da array
for (i = 0; i < notas.length; i++){
    soma = soma + notas[i]
}
//Declaração de variável e atribuição do valor de resultado da 
//expressão matemática
let media = soma / notas.length;
//Exibição do valor da variável média via console.log(par)
console.log(media)
