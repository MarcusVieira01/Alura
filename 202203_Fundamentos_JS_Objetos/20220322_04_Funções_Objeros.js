//Funções em objetos
//Declaração de objeto sendo que a chave dependente é um array
//de objetos
const cliente = {
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
        parentensco: 'Filha',
        dataNascimento: '04/01/2014',
        }
    ],
    saldo: 100,
    //Definição de função como par chave valor e definir ação
    //para nosso objeto
    depositar: function(valor)
    {
        //Uso da keyword this que referencia o prórpio objeto
        this.saldo += valor;
    }
}
//Exibição do valor da chave saldo via notação de ponto
console.log(cliente.saldo);
//Invocação da função .depositar(par) do objeto cliente;
cliente.depositar(200);
//Exibição do valor da chave saldo via notação de ponto
console.log(cliente.saldo);
