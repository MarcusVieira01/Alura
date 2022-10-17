//Criação de classe Admin e instanciamento

//Importação da classe User como módulo, via keyword import
import User from './20220526_User.js';
//Declaração da classe Admin herdando os atributos e métodos da superclasse User
export default class Admin extends User{
    //Declaração de método construtor para o intanciamento do objeto User
    constructor(nome, email, nascimento, role = 'administrador', ativo = true){
        //Uso da keywordsupper(args) que fará efetvamente a herança dos atributos da superclasse
        super(nome, email, nascimento, role, ativo);
    };

    //Declaração de função pública e uso da keyword return para retorno de uma template string com os valores dos atributos nome, usando polomirfismo sobre a mesma função definida dentro da casse User
    exibirInfos(){
        return `Administrador ${this.getNome}`;
    };

    //Método que retornará via keyword return os valores dos atributos nomeCurso e vagas via template String
    adicionarCurso(nomeCurso, vagas){
        return `Curso de ${nomeCurso} criado com ${vagas} vagas!`;
    };
};
//-----COMENTADO PARA PODER USAR EXPORTAÇÂO----
// //Instanciamento de novo objeto usando a classe Admin e passando os valores dos atributos
// const novoAdmin = new Admin('Rodrigo', 'r@r.com', '2002-01-03');
// //Exibição dos elemntos de novoAdmin e do retorno da função .exibirInfos() do mesmo objeto
// console.table(novoAdmin);
// console.log(novoAdmin.exibirInfos());
// //Exibição do retorno do método .criarCurso(args, args) do objeto novoAdmin
// console.log(novoAdmin.adicionarCurso('JavaScript', 200));
