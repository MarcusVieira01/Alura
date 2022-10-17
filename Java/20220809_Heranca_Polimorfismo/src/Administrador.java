public class Administrador extends Funcionario implements Autenticavel{
    //Declaração de atributos apenas da classe gerente
    private AutenticacaoUtil util;

    //Declaração de construtor padrão
    public Administrador(){
        this.util = new AutenticacaoUtil();
    }
    
    //Implementação de método abstrato
    @Override
    public double getBonificacao() {
        return 50;
    }

    //Implementação dos métodos abstratos da interface Autenticavel, sendo que há necessidade de sobrecarga dos métodos
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    } 
    @Override
    public boolean autenticacao(int senha) {
        return this.util.autenticacao(senha);
    }

    //COMENTADO POIS O ATRIBUTO SENHA NÃO PERTENCE MAIS A ESTA CLASSE
    // //Declaração de métodos getter e setters para os atributos construídos automaticamente
    // public int getSenha() {
    //     return senha;
    // }
}
