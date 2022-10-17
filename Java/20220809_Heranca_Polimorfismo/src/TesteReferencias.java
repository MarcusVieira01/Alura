public class TesteReferencias {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciamento de novo objeto advindo da classe Gerente e sua referência atribuída à variável g1
        Gerente g1 = new Gerente();

        //TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        //Instanciamento de novo objeto advindo da classe Funcionario e atribída sua referência à variável f1
        //Funcionario f1 = new Funcionario();

        //Instanciamento de novo objeto advindo da classe EditorVideo e atribída sua referência à variável ed1
        EditorVideo ed1 = new EditorVideo();

        //Instanciamento de novo objeto advindo da classe EditorVideo e atribída sua referência à variável des
        Designer des = new Designer();

        //Evocação do método setter do objeto g1
        g1.setNome("Marcus");
        g1.setSalario(5000.00);

        //TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        // //Evocação do método setter do objeto f1
        // f1.setNome("Vanessa");
        // f1.setSalario(3500.00);

        //Evocação do método setter do objeto ed1
        ed1.setNome("Bubasauro");
        ed1.setSalario(2500.00);

        //Evocação do método setter do objeto des
        des.setNome("Niemayer");
        des.setSalario(200.00);

        //Exibição do retorno do método getter do objeto g1, f1 e ed1
        System.out.println(g1.getNome() + " " + g1.getBonificacao());
        //System.out.println(f1.getNome() + " " + f1.getBonificacao());//TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        System.out.println(ed1.getNome() + " " + ed1.getBonificacao());

        //Instanciamento de novo objeto advindo da classe ControleBonificacao e sua referencia atribuida à variável controle do mesmo tipo da classe criadora
        ControleBonificacao controle = new ControleBonificacao();

        //Evocação de método do objeto controle que receberá como valor de parâmetro a referência do objeto g1, f1 e ed1
        controle.registra(g1);
        //controle.registra(f1);//TRECHO COMENTADO DEVIDO À ALTERAÇÃO DA CLASSE FUNCIONÁRIO TORNOU-SE ABSTRATA
        controle.registra(ed1);

        //Exibe o valor do atributo soma advindo do objeto controle, via método getter
        System.out.println("Soma de bonificacoes: " + controle.getSoma());
    }
}
