package src.Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
        // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

        Scanner in = new Scanner(System.in);
        float produtoValor = in.nextFloat();
        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println(" 2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println(" 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println(" 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.print("Escolha: ");
        int tipoPagamento = in.nextInt();

        switch (tipoPagamento){
            case 1:
                produtoValor *= 0.85;
                break;
            case 2:
                produtoValor *= 0.90;
                break;
            case 4:
                produtoValor *= 1.1;
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.printf("O preço do produto será: %.2f", produtoValor);



    }
}
