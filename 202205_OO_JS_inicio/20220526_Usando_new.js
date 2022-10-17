//Formas de instanciamento de objetos

//Declaração de função cosntrutora User(args, args) com seus atributos e métodos
function User(nome, email){
    //Atribuição dos valores de parâmetro aos elementos do objeto a ser instanciado
    this.nome = nome;
    this.email = email;
    //Definição de método interno ao objeto a ser instanciado
    this.exibirInfos = function(){
        //Uso da keyword return para retornar o valores dos atributos nome e email
        return `${this.nome}, ${this.email}`;
    }
}
//Declaração de variável e atribuição de nova instância de objeto via construtor User(arg,arg), via operador new
const novoUser = new User('Marcus', 'm@m.com');
//Exibição do valor de retorno do método do objeto novoUser.exibir(infos())
console.log(novoUser.exibirInfos());
//Exibição dos elementos e métodos do objeto instanciado a partir da função contrutora User(arg, arg)
console.table(novoUser);

//Declaração de função costrutora Admin(arg) que herdará os atributos e métodos da construtora User onde os valores de nome e e-mail já fazem parte da função construtora
function Admin(role){
    //Uso de método objeto.call(args) que gerará a herança de User para Admin de seus atributos e métodos
    User.call(this, 'Juliana', 'j@j.com');
    //Atribuição do valor de parâmetro ao elemento do objeto a ser instanciado, com um valor padrão caso seja vazio
    this.role = role || 'estudante';
}
//Criação de objeto via Object.creat(prototype), atribuindo as propriedades deste objeto criado, à propriedade Admin.prototype. Essa é a cadeia de prototipo
Admin.prototype = Object.create(User.prototype);
//Declaração de variável e atribuição de nova instância de objeto via construtor Admin(arg), via operador new
const novoAdmin = new Admin('admin');
//Exibição do valor de retorno do método do objeto novoAdmin.exibir(infos()) e do valor do atributo role
console.log(novoAdmin.exibirInfos());
console.log(novoAdmin.role);
//Exibição dos elementos e métodos do objeto instanciado a partir da função contrutora Admin( arg)
console.table(novoAdmin);

//Declaração de objeto literal
const userLit = {
    init: function(nome, email){
        this.nome = nome;
        this.email = email;
    },

    exibirInfos: function (nome){
        return this.nome;
    }
};
//Criação de objeto via Object.creat(prototype), usando o objeto literal como superclasse ou pai
const maisNovoUser = Object.create(userLit);
//Atribuição dos valores dos atributos do objeto maisNovoUser
maisNovoUser.init('Vanessa', 'v@v.com');
//Exibição do valor de retorno do método do objeto maisNovoUser.exibirInfos(arg), exibição de quem é o protótipo do objeto instanciado e o valor do objeto maisNovoUser 
console.log('Via objeto literal: ' + maisNovoUser.exibirInfos());
console.log(userLit.isPrototypeOf(maisNovoUser));//Basicamente o método pergunta se o objeto userLit(literal) é protótiopo de maisNovoUser, retornando booleano
console.log(maisNovoUser);
