package exercicios.introducaoJava;

import java.util.Scanner;

public class InverterSequencia {
    public static void main(String[] args) {
        // Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,Dezena e Unidade) e, 
        // utilizando operadores aritméticos, armazene cada dígito em umavariável de tipo inteiro. 
        // Por fim, reescreva o número no formato UCD em outra variávelde tipo inteiro e o imprima. 
        // Exemplo: 123 deve ser reescrito como 312.

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número com 3 dígitos (CDU): ");
        int numero = sc.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int inverte = (unidade * 100) + (centena * 10) + dezena;
        System.out.println("Número informado (CDU): " + numero);
        System.out.println("Número informado (UCD): " + inverte);
        
        sc.close();
    }
}
