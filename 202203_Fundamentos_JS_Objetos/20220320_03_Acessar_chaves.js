//Acessando chaves de objetos
//Declaração de objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com'
}
//Declaração de uma lista com as chaves do objeto
const chaves = ['nome', 'idade', 'cpf', 'email'];
//Exibição do valor de uma chave especificada pela lista chaves
//via forEach, com uma arrow function como claaback
chaves.forEach(info => console.log(cliente[info]));
