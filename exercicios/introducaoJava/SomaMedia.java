package exercicios.introducaoJava;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        // Escreva um programa que calcule a soma e a média aritmética de 3 números. 
        // Os 3 valores reais serão informados pelo usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os 3 valores: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        float soma = n1 + n2 + n3;
        float media = soma / 3;
        
        System.out.println("A soma é: " + soma);
        System.out.printf("A média é: %.2f", media);

        sc.close();
    }
}
