//Comparador ternário
const idadeMinima = 18;
let idadeCliente = 19;
//Comparação via if
if(idadeCliente >= idadeMinima){
    console.log("Cerveja liberada!");
}else{
    console.log("Nem fudendo! Toma leite!");
}
//Comparação via comparador ternário
console.log(idadeCliente >= idadeMinima ? 'Cerveja Liberada!':'Nem fudendo! Toma leite!');
