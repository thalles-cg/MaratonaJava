package src.Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar
        // A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int C;
        if (A == B){
            C = A + B;
        } else {
            C = A * B;
        }
        System.out.println("Resposta = " + C);
    }
}
