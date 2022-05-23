//Arquivo para realizarmos os testes

//Declaração de variável e atribuição do valor de retorno do método require(args), para importação de módulo externo
const pegaArquivo = require('../20220510_Index');

//Declaração de um array de objeto único que será usado como retorno esperado do teste "Deve retornar um array com resultados"
const arrayResult = [{FileList: 'https://developer.mozilla.org/pt-BR/docs/Web/API/FileList'}];

//Uso da função describe(descrição, callbackFUnction) para aninhar testes via funções it(descrição, callbackFunction)
describe('pegaArquivo::', () => {
    it('Deve ser uma função', () => {
        //Uso do método expect(function) e .toBe(arg) para definir a função que será testada e seu resultado esperado
        expect(typeof pegaArquivo).toBe('function');
    });
    it('Deve retornar um array com resultados', async() => {
        //Declaração de cariável com atribuição do retorno da função pegaArquivo(par) com a keyword await para uso da função assíncrona
        const result = await pegaArquivo('D:/Repositórios/Alura/202205_NodeJS_Primeira_lib/test/arquivos/texto.md');
        //Uso do método expect(function) e .toBe(arg) para definir a função que será testada e seu resultado esperado
        expect(result).toEqual(arrayResult);
    });
    it('Deve retornar mensagem "Não há links"', async() => {
        //Declaração de cariável com atribuição do retorno da função pegaArquivo(par) com a keyword await para uso da função assíncrona
        const result = await pegaArquivo('D:/Repositórios/Alura/202205_NodeJS_Primeira_lib/test/arquivos/texto_semlinks.md');
        //Uso do método expect(function) e .toBe(arg) para definir a função que será testada e seu resultado esperado
        expect(result).toBe('Não há links.');
    })
});
