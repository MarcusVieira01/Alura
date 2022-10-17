//Acessando dados dos objetos
//Declaração do objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com'
}
//Exibição do valor de duas chaves de um objeto via template 
//string 
console.log(`Nome do cliente: ${cliente.nome}
Idade: ${cliente.idade} anos`);
//Exibição dos 3 primeiros elementos de uma string via método
//.substrinf(início, quantidade_caracteres)
console.log(`Começo do CPF: ${cliente.cpf.substring(0, 3)}`);
