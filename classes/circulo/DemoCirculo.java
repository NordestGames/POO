package classes.circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(1.0);
        Circulo c2 = new Circulo(2.0);

        System.out.println("Perimetro de c1: " + c1.perimetro());
        System.out.println("Perimetro de c2: " + c2.perimetro());
    }
}
