//Sintaxe de espalhamento
//Declaração de um array de objetos
const cliente = [{
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com',
    fones: ['+5511985211147', '+551133255569'],
    dependente: 
    [
        {
        nome: 'Sara',
        parentesco: 'Filha',
        dataNascimento: '20/03/2021',
        },
        {
        nome: 'Samia Maria',
        parentesco: 'Filha',
        dataNascimento: '04/01/2014',
        }
    ]
},{
    nome:'Marcus',
    idade:37,
    cpf:'15978855632',
    email:'marcus@marcusmail.com',
    fones: ['+551122544478'],
    dependente: 
    [
        {
        nome: 'Zuleikha',
        parentesco: 'Filha',
        dataNascimento: '20/05/2014',
        }
    ]
}
]
//Uso de operador de espalhamento e chamada das chaves dos
//objetos contidos no array de objetos cliente, sendo que os
//retornos constam dentro de um array definido
const listaDependentes = [...cliente[0].dependente, 
                          ...cliente[1].dependente];
//Exibição do valor da variável listaDependentes
console.log(listaDependentes);
//Exibição do retorno da função typeof sobre os valores da
//variável lisraDependentes
console.log(typeof listaDependentes);
//Exibição tabulada dos valores atribuídos à variável 
//listaDependentes
console.table(listaDependentes);
