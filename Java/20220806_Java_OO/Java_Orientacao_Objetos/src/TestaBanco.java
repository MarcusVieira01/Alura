public class TestaBanco {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciamento de novo objeto Cliente advindo do construtor Cliente() e atribuída a sua referência à variável marcus
        Cliente marcus = new Cliente();
        //Atribuição dos valores dos atributos do objeto
        marcus.setNome("Marcus Vieira");
        marcus.setCpf("265.255.223-58");
        marcus.setProfissao("Dev");

        //instanciamento de novo objeto Conta advindo do construtor Conta() e atribuída a sua referência à variável contaMarcus
        Conta contaMarcus = new Conta(18, 56);
        //Atribuição de valor do atributo saldo via método .deposita(valor) do objeto
        contaMarcus.deposita(250.00);

        //Atribuição da referência de um objeto Cliente contida na variável marcus para o atributo titular do objeto contaMarcus
        contaMarcus.setTitular(marcus);

        //Podemos realizar a instanciação da classe cliente direta na atribuição
        //contaMarcus.titular = new Cliente();
        /*
        //Atribuição dos valores dos atributos do objeto
        contaMarcus.titular.nome = "Marcus Vieira";
        contaMarcus.titular.cpf = "265.255.223-58";
        contaMarcus.titular.profissao = "Dev";
         */

        //Exibição do conteúdo do atributo nome, de valor advindo de associação de classes
        System.out.println(contaMarcus.getTitular().getNome());
    }
}
