package src.Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();

        if (num % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
