//Prototype e propriedades
//declaração de função Construtora
function Cliente(nome, cpf, email, saldo){
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.saldo = saldo;
    this.depositar = function(valorDep){
        saldo += valorDep;
    }
}
//Declaração de variável a atribuição de nova instância de objeto
//usando a função constrtutora Cliente(par)
const andre = new Cliente('Andre', '1244566687-41', 
                          'andre@andremail.com', 200);
//Exibição do objeto atribuído à variável andre
console.log(andre);
