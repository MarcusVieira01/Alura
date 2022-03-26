//Primeiro problema
//Declaração de variáveis e atribuição dos valores de 
//inicialização
const precosLivros = [25, 15, 30, 50, 45, 20];
let menor = 0;
//Loop for que varrerá o array precosLivros
for (let atual = 0; atual < precosLivros.length; atual++) {
    //Condicional simples que atribuirá o índice do elemento na
    //variável menor quando o teste lógico for True
    if(precosLivros[atual] < precosLivros[menor]){
        menor = atual;
    }
}
//Exibição do valor do elemento menor do array precosLivros
console.log(`O livro mais barato custa ${precosLivros[menor]}`);
