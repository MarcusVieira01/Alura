public class MinhaExcecao extends Exception{
    //
    public MinhaExcecao(String msg){
        super(msg);//Evocação de construtor de superclasse, via keyword super, e inserido valor atribuído à variável msg
    }
}
