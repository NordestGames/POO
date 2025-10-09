package classes.conversao;

public class ConversaoUnidades {
    public static double polegadasCentrimetros(double polegadas){
        return 2.54 * polegadas;
    }
    
    public static double pesCentrimetros(double pes){
        return 30.48 * pes;
    }

    public static double milhasQuilometros(double milhas){
        return 1.609 * milhas;
    }
}
