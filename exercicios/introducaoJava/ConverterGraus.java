package exercicios.introducaoJava;

import java.util.Scanner;

public class ConverterGraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Informe o ângulo em graus: ");
        int anguloEmGraus = sc.nextInt();

        // double radiano = Math.toRadians(anguloEmGraus);
        double radiano = (anguloEmGraus * pi) / 180;

        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);

        double cossecante = 1 / seno;
        double secante = 1 / seno;
        double contagente = 1 / seno;
        
        System.out.printf("Radiano: %.4f", radiano);
        System.out.printf("Seno: %.4f", seno);
        System.out.printf("Cosseno: %.4f", cosseno);
        System.out.printf("Tangente: %.4f", tangente);
        System.out.printf("Cossecante: %.4f", cossecante);
        System.out.printf("Secante: %.4f", secante);
        System.out.printf("Contagente: %.4f", contagente);
        
        sc.close();
    }
}
