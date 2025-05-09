package src.Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
    // 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int antecessor = num -1;
        int sucessor = num +1;

        System.out.println(antecessor + ", " + num + ", " + sucessor);
    }
}
