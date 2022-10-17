//Objetos em objetos
//
//Declaração de objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com',
    fones: ['+5511985211147', '+551133255569'],
}
//Atribuição da chave valor dependente no objeto cliente via
//Notação de pontos
cliente.dependente = {
    nome: 'Sara',
    parentesco: 'Filha',
    dataNascimento: '20/03/2021',
}
//Exibição dos pares chave valor do objeto cliente
console.log(cliente);
//Atribuição de valor na chave nome, do objeto dependente 
//aninhado no objeto cliente via notação de pontos
cliente.dependente.nome = 'Sara Cristina';
//Exibição dos pares chave valor do objeto cliente
console.log(cliente);
