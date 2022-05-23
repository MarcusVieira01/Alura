//Arquivo para realizarmos os testes

//Método do pacote Jest que fará o teste de uma função
test('Deve ser uma função', () => {
    //Uso do método expect(function) e .toBe(arg) para definir a função que será testada e seu resultado esperado
    expect(typeof pegaArquivo).toBe('function');
});
