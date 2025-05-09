package src.Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();

        System.out.println(num * 1.05);
    }
}
