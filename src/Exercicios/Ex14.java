package src.Exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        Scanner in = new Scanner(System.in);
        System.out.print("Escreva o valor A: ");
        float A = in.nextFloat();
        System.out.print("Escreva o valor B: ");
        float B = in.nextFloat();
        float aux = B;
        B = A;
        A = aux;
        System.out.println("Valor A: " + A + "\nValor B: " + B);
    }
}
