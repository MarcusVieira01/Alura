//Criação de classe docente e instanciamento

//Importação da classe User como módulo, via keyword import
import User from './20220526_User.js';
//Declaração da classe Docente herdando os atributos e métodos da superclasse User
export default class Docente extends User{
    //Declaração de método construtor para o intanciamento do objeto User
    constructor(nome, email, nascimento, role = 'docente', ativo = true){
        //Uso da keywordsupper(args) que fará efetvamente a herança dos atributos da superclasse
        super(nome, email, nascimento, role, ativo);
    };

    //Método que retornará via keyword return os valores dos atributos estudante, curso e nota via template String
    aprovaEstudante(estudante, curso, nota){
        return `O aluno ${estudante} foi aprovado no curso ${curso} com nota ${nota}!`
    };
};
//-----COMENTADO PARA PODER USAR EXPORTAÇÂO----
// //Instanciamento de novo objeto usando a classe Docente e passando os valores dos atributos
// const novoDocente = new Docente('Mariana', 'd@d.com', '2002-06-07');
// //Exibição dos elementos de novoDocente, do retorno do método .exibirInfos() e .aprovaEstudante(args, args) do mesmo objeto
// console.table(novoDocente);
// console.log(novoDocente.exibirInfos());
// console.log(novoDocente.aprovaEstudante('Marcus', 'ADS', 10));
