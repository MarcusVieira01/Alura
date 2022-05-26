//Criação de classe User e instanciamento

//Importação da classe User como módulo, via keyword import
import User from './20220526_User.js';
//Declaração da classe Admin herdando os atributos e métodos da superclasse User
class Admin extends User{
    //Declaração de método construtor para o intanciamento do objeto User
    constructor(nome, email, nascimento, role = 'administrador', ativo = true){
        //
        super(nome, email, nascimento, role, ativo);
    }
}
//Instanciamento de novo objeto usando a classe Admin e passando os valores dos atributos
const novoAdmin = new Admin('Rodrigo', 'r@r.com', '2002-01-03');
//Exibição dos elemntos de novoAdmin e do retorno da função .exibirInfos() do mesmo objeto
console.table(novoAdmin);
console.log(novoAdmin.exibirInfos());
