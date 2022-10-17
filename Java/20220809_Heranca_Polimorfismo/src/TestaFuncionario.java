public class TestaFuncionario {
    //Declaração de método principal
    public static void main(String[] args) {
        //TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        //Instanciamento de novo objeto advindo da classe Funcionario e atribída sua referência à variável nico
        //Funcionario nico = new Funcionario();
        //Instanciamento de novo objeto advindo da classe Gerente, que herdará Funcionário, e atribuída sua referência à variável gerente
        Gerente gerente = new Gerente();

        //TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        // //Evocação dos métodos setter para popular o objeto com valores dos atributos
        // nico.setNome("Nico");
        // nico.setCpf("256.254.258-41");
        // nico.setSalario(2600.00);

        gerente.setNome("Marcus");
        gerente.setCpf("214.236.258-88");
        gerente.setSalario(6000.00);
        gerente.setSenha(2222);

        //TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        // //Exibição dos valores de retorno dos métodos getter da referência nico e gerente, além de evocação do método .autentica apenas do objeto gerente
        // System.out.println("Funcionario: " + nico.getNome());
        // System.out.println("Bonificacao do funcionario: " + nico.getBonificacao());

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Bonificacao do gerente: " + gerente.getBonificacao());
        System.out.println("Autenticou? " + gerente.autenticacao(2222));
    }
}
