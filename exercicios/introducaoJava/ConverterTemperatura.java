package exercicios.introducaoJava;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        // Escreva um programa que receba uma temperatura em graus centígrados 
        // e a apresenteem graus Fahrenheit.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em °C: ");
        float tempCelsius = sc.nextFloat();

        double fahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("Celsius em Fahrenheit: %.1f", fahrenheit);

        sc.close();
    }
}
