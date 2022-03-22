//Tipos de dados e valores
//Declaração de objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com',
    fones: ['+5511985211147', '+551133255569'],
}
//Exibição dos valores da chave fone via console log por uma
//Arrow Function via metodo .forEach(function) e usando
//notação de ponto
cliente.fones.forEach(fone => console.log(fone));
