public class Gerente extends Funcionario implements Autenticavel{
    //Declaração de atributos
    private AutenticacaoUtil util;
    
    //Declaração de construtor padrão
    public Gerente(){
        this.util = new AutenticacaoUtil();
    }
    
    //Implementação do método getBonificação() abstrato, usando método getter da super classe para retornar com o valor do salário
    public double getBonificacao(){
        return super.getSalario();
    }
    

    //Implementação dos métodos abstratos da interface Autenticavel, sendo que há necessidade de sobrecarga dos métodos
    @Override
    public void setSenha(int senha) {
        this.util.autenticacao(senha);
    } 
    @Override
    public boolean autenticacao(int senha) {
        return this.util.autenticacao(senha);
    }

    // //Declaração de método getter manual, com lógica de bonificação com o uso da keyword super para evidenciar a herança do atributo e método, que não é nativo à essa classe filha
    // public double getBonificacao(){
    //     return super.getBonificacao() + super.salario;
    // }

    // //Declaração de método de autenticação
    // public boolean autenticacao(int senha){
    //     if(this.senha == senha){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }    
}
