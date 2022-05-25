//Criação de um objeto literal com as propriedades definidas
const user = {
    nome: "Juliana",
    email: 'j@j.com',
    nascimento: '2021/01/02',
    role:'admin',
    ativo: true,
    exibirInfos: function(){
        console.log(this.nome,this.email);
    }
};
//Chamada de método do objeto user
user.exibirInfos();
//Declaração de variável e atribuição do retorno da função exibirInfos, sem () pois não será executada a função e sim apenas atribuído retorno, do objeto user
const exibir = user.exibirInfos;
//Chamada da função exibir, herdada da função exibirInfos do objeto user (gera undefined undefined pois está descontextualizada)
exibir();
//Declaração de variável e atribuição de função que exibirá o valor da propriedade nome, usando a keyword this. Como não há referencia de onde o this deve contetualizar, haverá erro se não usar o método bind
const exibirNome = function(){
    console.log(this.nome);
}
//Declarção de variável e atribuição da função exbirNome usando o método bind(arg) que contextualizaráa execução com o objeto do argumento
const exibirN = exibirNome.bind(user);
//Evocação da função exibirN()
exibirN();
