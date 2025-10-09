package classes.conversao;

public class DemoConversao {
    public static void main(String[] args) {
        System.out.println("2 milhas = " + ConversaoUnidades.milhasQuilometros(2.0));
        System.out.println("0.5 em pes = " + ConversaoUnidades.pesCentrimetros(0.5));
        System.out.println("5 em polegadas = " + ConversaoUnidades.polegadasCentrimetros(5));

    }
}
