package src.Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        Scanner in = new Scanner(System.in);
        float media = 0;
        for (int i = 0; i < 3; i++) {
            float nota = in.nextFloat();
            media += nota;
        }
        media = media/3;
        System.out.printf("A média foi: %.2f", media);
    }
}
