//Criando classe
//Definição da classe Cliente(atributos) e seus devidos métodos
class Cliente{
    //Definição do método construtor com os atributos do objeto
    constructor(nome, email, cpf, saldo){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    //Definição de métodos internos à classe para que os objetos
    //instanciados possam ter esse comportamdento evocado 
    //posteriormente
    depositar(valorDep){
        this.saldo += valorDep
    }
    exibeSaldo(){
        console.log(this.saldo);
    }
}
//Instanciamento de novo objeto atribuído à variável andre
const andre = new Cliente('Andre', 'andre@gmail.com', 
                          '15975302528', 500);
//Exibição do objeto atribuído a variável andre
console.log(andre);
//Evocação de função/método .exibirSaldo() do objeto andre
andre.exibirSaldo();
