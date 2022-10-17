//Somando com reduce
//Declaração de variáveis com valores atribuídos sendo arrays
const salaJS = [7, 8, 8, 7,, 10, 6.5, 4, 10, 7];
const salaJava = [6, 5, 8, 9, 5, 6];
const salaPython = [7, 3.5, 8, 9.5];
//Declaração de função que usará o método.reduce(function, inicial)
function mediaSala(sala){
    //Declaração de variável e atribuição do valor de retorno do
    //método .reduce(acumulador, atual)
    const somaNotas = sala.reduce((acumulador, atual) => 
    atual + acumulador, 0);
    //Uso da keyword return para que a função retorne o valor de 
    //resultado da expressão matemática
    return somaNotas / sala.length;
}
//Exibição dos valores de retorno da função mediaSala(arg) via
//template string
console.log(`Média da sala de JS é ${mediaSala(salaJS)}`);
console.log(`Média da sala de Java é ${mediaSala(salaJava)}`);
console.log(`Média da sala de Python é ${mediaSala(salaPython)}`);

//Segundo exemplo
//Declaração de variável com valor atribuído sendo uma array
const notas = [10, 6.5, 8, 7];
//Declaração de variável e atribuição do valor de resultado 
//da expressão matemática
const media = notas.reduce((acumulador, atual) => 
atual + acumulador, 0) / notas.length;
//Exibição via template string do valor da variável média
console.log(`A média do aluno é ${media.toFixed(2)}`);
