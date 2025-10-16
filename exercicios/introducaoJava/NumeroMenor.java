package exercicios.introducaoJava;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        // Escreva um programa que lê três números e determina qual número é o menor

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe 3 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 <= n2 && n1 <= n3){
            System.out.println("Número menor é: " + n1);
        }else if(n2 <= n3){
            System.out.println("Número menor é: " + n2);
        }else {
            System.out.println("Número menor é: " + n3);
        }
        
        sc.close();
    }
}
