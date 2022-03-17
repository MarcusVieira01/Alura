//Conversões de tipos
//Conversão implícita
const numero = 456;
const cadeia = '654';
const cadeia2 = '654 a'

console.log(numero === cadeia);
//Conversão implícita com comparação apenas do valor e não do tipo
console.log(numero == cadeia);
//Concatenou duas variáveis transfornando em string
console.log(numero + cadeia);

//Conversão explícita
console.log(Number(cadeia));
console.log(String(numero));
console.log(Number(cadeia2));
