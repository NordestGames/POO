package exercicios.introducaoJava;

import java.util.Scanner;

public class IntervaloEmMinutos {
    public static void main(String[] args) {
        // Escreva um programa que recebe um valor inteiro representando um intervalo em minutos 
        // e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e minutos. 
        // Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o intervalo em minutos: ");
        int valorMinutos = sc.nextInt();

        int dias = valorMinutos / 1440;

        int restoDias = valorMinutos % 1440;

        int horas = restoDias / 60;

        int minutos = restoDias % 60;

        System.out.println(valorMinutos + " minutos = " + dias + " dias, " + horas + " horas, " + minutos + " minutos");


        sc.close();
    }
}
