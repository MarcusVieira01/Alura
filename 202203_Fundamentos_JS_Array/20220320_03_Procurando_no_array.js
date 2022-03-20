//Procurando em um array
//Declaração das arrays
const alunos = ['João', 'Juliana', 'Caio', 'Ana'];
const mediaAlunos = [10, 7, 9, 6];
let listaNotasAlunos = [alunos, mediaAlunos];
//Definição de uma arrow function
const exibeNomeNota = (nomeAluno) => {
    //Condicional simples que executará o bloco caso true
    if (listaNotasAlunos[0].includes(nomeAluno)){
        //Declaração de variável e atribuição do valor de retorno
        //do método .indexOf(par)
        let indice = listaNotasAlunos[0].indexOf(nomeAluno);
        //Uso da keyword return para retornar os valores dos
        //elementos desejados concatenado com uma string
        return listaNotasAlunos[0][indice] + ' sua média é ' + 
        listaNotasAlunos[1][indice];
    //Condicional que executará o bloco caso o primeiro teste 
    //lógico for false
    }else{
        //Retorno de template string
        return `Aluno ${nomeAluno} não cadastrado!`
    }
}
//Exeibição do retorno da função exibeNomeNota via função 
//console.log(par)
console.log(exibeNomeNota('Juliana'));
