public class TesteSistema {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de objeto advindo da classe Gerente e Administrador via construtor padrão
        Gerente ger = new Gerente();
        Administrador adm = new Administrador();

        //Instanciação de objeto advindo da classe SistemaInterno via construtor padrão
        SistemaInterno sis = new SistemaInterno();

        //Evocação de método setter que definirá o valor do atributo senha
        ger.setSenha(2222);
        adm.setSenha(2222);

        //Evocação de método do objeto, de refeência contida em sis, que exibirá uma mensagem pertinente
        sis.autentica(ger);
        sis.autentica(adm);
    }
}