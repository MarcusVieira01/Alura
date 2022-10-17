//Lista de objetos
//Declaração de objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com',
    fones: ['+5511985211147', '+551133255569'],
    dependente: [{
        nome: 'Sara',
        parentesco: 'Filha',
        dataNascimento: '20/03/2021',
    }]
}
//Inclusão de um novo objeto dentro de uma chave do objeto 
//cliente via método de arrays .push(valor)
cliente.dependente.push({
    nome: 'Samia Maria',
    parentensco: 'Filha',
    dataNascimento: '04/01/2014',
})
//Exibição dos pares chave valor do objeto cliente
console.log(cliente);
//Atribuição do valor de retorno do método .filter(function)
//Esse retorno sempre será um array
const filhaNova = cliente.dependente.filter(dependente => dependente.dataNascimento === '04/01/2014');
//Como o valor da variável filhaNova é uma string que conterá 
//um objeto, para exibirmos o valor da chave nome chamamos o 
//elemento da array
console.log(`Exibição do nome do elemento da array 
${filhaNova[0].nome}`);
