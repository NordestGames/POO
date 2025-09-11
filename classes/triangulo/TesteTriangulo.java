public class TesteTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializa(3, 4, 5, "Escaleno");
        t2 = new Triangulo();
        t2.inicializa(3, 4, 5, "Escaleno");
        t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
