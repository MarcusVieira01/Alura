public class TestaValores {
    //
    public static void main(String[] args) {
        //
        int primeiro = 5;
        int segundo = 7;

        //
        segundo = primeiro;
        primeiro = 10;//Não será atribuído pois no Java a sequencia de atribuições é levada em conta

        //
        System.out.println(segundo);
    }
}
