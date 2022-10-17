//Declaração de classe abstrata para ser herdada pelos outros conceitos de funcionários
public abstract class Funcionario {
    //Declaração de atributos
    private String nome;
    private String cpf;
    protected double salario;

    //Declaração de Construtor da classe Funcionario
    // public Funcionario(){

    // }

    //Declaração de métodos getter e setters para os atributos construídos automaticamente
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Declaração de método abstrato para ser herdado e não possui implementação
    public abstract double getBonificacao();

}
