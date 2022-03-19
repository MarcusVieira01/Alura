//Dividindo arrays com método slice()
//Declaração de array
const nomes = ['João', 'Juliana', 'Ana', 
'Caio', 'Lara', 'Marjore', 
'Guilerme', 'Aline', 'Fabiana',
'André', 'Carlos', 'Paulo',
'Bia', 'Vivian', 'Isabela', 
'Vinícius', 'Renan', 'Renata', 
'Daisy', 'Camilo'];
//Declaração de variáveis e atribuição dos valores de retorno do
//método nomes.slice(par)
let sala1 = nomes.slice(0, ((nomes.length)/2)); 
let sala2 = nomes.slice(((nomes.length) / 2));
//Exibição dos valores das variáveis sala1 e sala2 além do retorno
//do método sala1.length e sala2.length, ambos formatados via
//template string
console.log(`Alunos da sala 1: ${sala1} com ${sala1.length} alunos`);
console.log(`Alunos da sala 2: ${sala2} com ${sala2.length} alunos`);
