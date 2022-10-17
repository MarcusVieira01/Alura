//Alterando array com método .splice(args);
//Declaração de array
const listaChamada = ['João', 'Juliana', 'Ana', 
'Caio', 'Lara', 'Marjore', 
'Guilerme', 'Aline', 'Fabiana',
'André', 'Carlos', 'Paulo',
'Bia', 'Vivian', 'Isabela', 
'Vinícius', 'Renan', 'Renata', 
'Daisy', 'Camilo'];
//Exibição do array listaChamada
console.log(listaChamada);
//Utilização do método .splice(args) para remover dois elementos
//e incluir um elemento de valor 'Rodrigo'
listaChamada.splice(1, 2, 'Rodrigo');
//Exibição do novo valor da lista listaChamada
console.log(listaChamada);
//Utilização do método .splice(args) com sintaxe de inclusão apenas
//sem remoção
listaChamada.splice(3, 0, 'Marcus');
//Exibição do novo valor da lista listaChamada
console.log(listaChamada);
