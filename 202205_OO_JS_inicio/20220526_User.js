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
    };

    //Declaração de métodos getter via keyword get
    get getNome(){
        //Retorno do valor do atributo nome, privado e contextualizado ao objeto via keyword this
        return this.#nome;
    };
    get getEmail(){
        //Retorno do valor do atributo email, privado e contextualizado ao objeto via keyword this
        return this.#email;
    };
    get getNascimento(){
        //Retorno do valor do atributo nascimento, privado e contextualizado ao objeto via keyword this
        return this.#nascimento;
    };
    get getRole(){
        //Retorno do valor do atributo role, privado e contextualizado ao objeto via keyword this
        return this.#role;
    };
    get getAtivo(){
        //Retorno do valor do atributo ativo, privado e contextualizado ao objeto via keyword this
        return this.#ativo;
    };

    //Declarção de métodos setter via keyword set
    set setNome(novoNome){
        //Condicional que verifica se o input é vazio e caso true, instancia novo objeto Error passando como valor a mensagem pertinente
        if(novoNome === ''){
            throw new Error('Input vazio!');
        }else{//Caso false, é atribuido o valor novoNome ao atributo #nome
            this.#nome = novoNome};
    };

    //Declaração de método público e uso da keyword return para retorno de uma template string com os valores de retorno dos métodos getter
    exibirInfos(){
        return `${this.getNome}, ${this.getEmail}, ${this.getAtivo}`;
    }
    
    //-----COMENTADO DEVIDO EXEMPLO DE AULA---
    // //Declaração de método publico
    // exibirInfos(){
    //     const objUser = this.#montaObjUser();
    //     //Retorno dos valores dos atributos nome, email e ativo via keyword return e template string
    //     return `${objUser.nome}, ${objUser.email}, ${objUser.ativo}`;
    // };
    // //Declaração de método privado que montará um objeto literal
    // #montaObjUser(){
    //     return ({
    //         nome: this.#nome,
    //         email: this.#email,
    //         nascimento: this.#nascimento,
    //         role: this.#role,
    //         ativo: this.#ativo
    //     });
    // };

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
