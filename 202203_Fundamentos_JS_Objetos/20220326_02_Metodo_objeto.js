//Método de objetos
//Declaração de objeto
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
function ofereceSeguro(obj){
    const propsClientes = Object.keys(obj);
    if(propsClientes.includes('dependente')){
        console.log(`Oferta de seguro de vida válido para ${obj.nome}`)
    }else{
        console.log(`O ${obj.nome} não possui dependentes`)
    }
}
//-----------------------------------------------

//Declaração de variável e atribuição do valor de retorno do 
//método Object.keys(object)
const contemChaves = Object.keys(cliente);
//Exibição do valor da variável contemChaves
console.log(contemChaves);
//Exibe o retorno do método Object.values(object)
console.log(Object.values(cliente));
//Exibe o retorno do método Object.entries(object)
console.log(Object.entries(cliente));
//Invocação da função ofereceSeguro(par) para o objeto cliente
ofereceSeguro(cliente);
