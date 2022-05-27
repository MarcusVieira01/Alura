//Criação de uma classe e exprotação para uso externo

//Declaração da classe User com exportação para acesso externo
export default class User{
    //Declaração de atributos privados
    #nome; #email; #nascimento; #role; #ativo;
    //Declaração da função construtora e seus atributos onde o atributo ativo já receberá o valor ativo ao ser instanciado o objeto, a não ser que algo altere esse estado
    constructor(nome, email, nascimento, role, ativo = true){
        this.#nome = nome;
        this.#email = email;
        this.#nascimento = nascimento;
        this.#role = role || 'estudante';//Definição de valor inicial caso não seja inserido nada
        this.#ativo = ativo;
    }
    //Declaração de método privado que montará um objeto literal
    #montaObjUser(){
        return ({
            nome: this.#nome,
            email: this.#email,
            nascimento: this.#nascimento,
            role: this.#role,
            ativo: this.#ativo
        });
    };
    exibirInfos(){
        const objUser = this.#montaObjUser();
        return `${objUser.nome}, ${objUser.email}, ${objUser.ativo}`;
    }
    //-----COMENTADO PARA REFATORAÇÃO DA LÓGICA DA AULA-----
    // //Declaração de função e uso da keyword return para retorno de uma template string com os valores dos atributos nome, email e ativo
    // exibirInfos(){
    //     return `${this.#nome}, ${this.#email}, ${this.#ativo}`;
    // }
};
//-----COMENTADO PARA PODER EXPORTAR A CLASSE----
// //Instanciamento de novo objeto novoUser via operador new
// const novoUser = new User('Marcus', 'm@m.com', '1985-08-21');
// //Exibição dos atributos do objeto novoUser e do valor de retorno do método .exibirInfos() deste mesmo objeto
// console.table(novoUser);
// console.log(novoUser.exibirInfos());
// //Exibição se o atributo protótipo de user é o mesmo prótotipo de novoUser
// console.log('User é protótipo de novoUser? ' + User.prototype.isPrototypeOf(novoUser));
