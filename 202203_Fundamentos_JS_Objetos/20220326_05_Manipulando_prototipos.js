//Manipulando protótipos
//Definição de método ou função construtora
function Cliente(nome, cpf, email, saldo){
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.saldo = saldo;
    this.depositar = function(valorDep){
        saldo += valorDep;
    }
}
//Definição de função cosntrutora com herança da função
//construtora Cliente(args)
function ClientePoupanca(nome, cpf, email, saldo, saldoP){
    Cliente.call(this, nome, cpf, email, saldo);
    this.saldoP = saldoP;
}
//Instancia de novo objeto via método construtor
//ClientePoupanca(args)
const marcus = new ClientePoupanca('Marcus', '14785236988', 
                    'marcus!@email.com.br', '30000', 200)
//Exibição do objeto atribuído à variavel marcus
console.log(marcus);
//Inclusão de função via método .prototype.nome_propriedade, 
//atribuíndo uma nova função
ClientePoupanca.prototype.depositarP = function(depP){
    this.saldoP += depP;
}
//Invocação de método .depositar(args) do objeto marcus
marcus.depositarP(20)
//Exibição do objeto atribupido à variável marcus
console.log(marcus);
