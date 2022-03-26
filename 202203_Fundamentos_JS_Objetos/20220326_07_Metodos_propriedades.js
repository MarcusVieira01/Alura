//Métodos e propriedades
//Definição de classe Cliente, sendo ela a SuperClasse
class Cliente{
    //Definição do método construtor com os atributos definidos
    //para o objeto
    constructor(nome, email, cpf, saldo){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    //Definição de métodos para atribuir comportamento ao cobjeto
    //Instanciado
    depositar(valorDep){
        this.saldo += valorDep;
    }
    exibirSaldo(){
        console.log(this.saldo);
    }
}
//Definição de classe ClientesP que herdará todos métodos e 
//atributos da classe Cliente via keyword extends
class ClienteP extends Cliente{
    //Definição do método construtor com os atributos definidos
    //para o objeto incluíndo os atributos da SuperClasse Cliente
    //usando o método super(atributos)
    constructor(nome, email, cpf, saldo, saldoP){
        super(nome, email, cpf, saldo);
        this.saldoP = saldoP;
    }
    //Definição de métodos para atribuir comportamento ao cobjeto
    //Instanciado
    depositarP(valorP){
        this.saldoP += valorP;
    }
    exibeSaldoP(){
        console.log(this.saldoP);
    }
}
//Declaração de variável e atribuição de novo instanciamento de
//objeto via classe ClienteP(atributos
const andre = new ClienteP('Andre', '123555648-45', 
                        'andre@gmail.com', 500, 100)
//Exibição do objeto atribuído à variável andre
console.log(andre);
//Evocação de métodos do objeto andre
andre.depositar(200);
andre.depositarP(300);
andre.exibirSaldo();
andre.exibeSaldoP();
