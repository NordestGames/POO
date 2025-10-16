package exercicios.introducaoJava;

import java.util.Scanner;

public class AlavancarVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int eletros = 222;
        int camaMesaBanho = 111;
        
        System.out.print("Informe o código do setor: ");
        int codSetor = sc.nextInt();
        System.out.print("Informe o valor do produto: ");
        float valorProduto = sc.nextFloat();
        
        double valorComDesconto;

        if(codSetor == eletros){
            if(valorProduto > 500) {
                valorComDesconto = valorProduto * 0.90;
                System.out.println("Setor de Eletros");
                System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);
            }else {
                System.out.println("Setor de Eletros (sem desconto)");
                System.out.printf("Valor final: R$ %.2f\n", valorProduto);
            }
        } else if(codSetor == camaMesaBanho){
            if(valorProduto > 100){
                valorComDesconto = valorProduto * 0.60;
            } else if(valorProduto > 50){
                valorComDesconto = valorProduto * 0.80;
            } else {
                valorComDesconto = valorProduto * 0.90;
            }
            System.out.println("Setor de Cama, Mesa e Banho");
            System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);
        } else {
            System.out.println("Setor Invalido");
        }
        
        sc.close();
    }
}
