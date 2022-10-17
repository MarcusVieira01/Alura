//Arrow Function
const apresentarArrow = nome => `Meu nome é ${nome}`;
const soma = (num1, num2) => num1 + num2;
const somaNumPeq = (num1, num2) => {
    if(num1 && num2 > 10){
        return 'Somente números entre 1 e 9'
    }else{
        return num1 + num2;
    }
}

console.log(apresentarArrow('Marcus'));
console.log(soma(1, 3));
console.log(somaNumPeq(1, 12));
