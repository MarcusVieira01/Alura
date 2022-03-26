//For...in
//A declaração davariável "info" poderia ter sido nomeada como
//"chave" pois sempre é atribuído o nome da chave do objeto
//Declaração de objeto
const cliente = {
    nome:'André',
    idade:36,
    cpf:'45696325811',
    email:'andre@andremail.com',
    fones: ['+5511985211147', '+551133255569'],
    dependente: 
    [
        {
        nome: 'Sara',
        parentesco: 'Filha',
        dataNascimento: '20/03/2021',
        },
        {
        nome: 'Samia Maria',
        parentensco: 'Filha',
        dataNascimento: '04/01/2014',
        }
    ],
    saldo: 100,
    //Definição de função como par chave valor e definir ação
    //para nosso objeto
    depositar: function(valor)
    {
        //Uso da keyword this que referencia o prórpio objeto
        this.saldo += valor;
    }
}
//Declaração de variável acumuladora e atribuição de valor 
//de inicialização
let relatorio = '';
//Loop for com uso da keyword "in" para percorrer as chaves 
//um objeto
for(let info in cliente){
    relatorio += `${info} `;
}
//Exibição do valor da variável relatorio
console.log(relatorio);
//-------------------------------------------------

//Declaração de variável acumuladora e atribuição de valor 
//de inicialização
let relatorio2 = '';
//Loop for com uso da keyword "in" para percorrer as chaves 
//um objeto e o valor da chave em cada iteração
for(let info in cliente){
    relatorio2 += `${cliente[info]} `;
}
//Exibição do valor da variável relatorio2
console.log(relatorio2);
//-------------------------------------------------

//Declaração de variável acumuladora e atribuição de valor 
//de inicialização
let relatorio3 = '';
//Loop for com uso da keyword "in" para percorrer as chaves 
//um objeto e o valor da chave em cada iteração.
for(let info in cliente){
    //Condicional que usa a função "typeof nome+objeto" para 
    //retornar qual tipo de dados o valor da chave do objeto 
    //possui 
    if(typeof cliente[info] === 'object' ||
        typeof cliente[info] === 'function'){
        //Caso o teste lógico seja True será atigida a keyword
        //"continue" que fará o fim da iteração e passará para
        //a próxima
        continue
    }else{
        relatorio3 += `${info} -> ${cliente[info]}; 
        `;
    }
}
//Exibição do valor da variável relatorio3
console.log('Saída mais inteligível: ' + relatorio3);
//-------------------------------------------------
