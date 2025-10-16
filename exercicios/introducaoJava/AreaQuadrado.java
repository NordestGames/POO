package exercicios.introducaoJava;

import java.util.Scanner;

// Escreva um programa que calcule a área de um quadrado. 
// O valor do lado de um quadrado deverá ser informado pelo usuário.

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do lado do quadrado (em metros): ");
        int lado = sc.nextInt();

        int area = lado * lado;

        System.out.println("Área do quadrado: " + area + " m²");

        sc.close();
    }
}