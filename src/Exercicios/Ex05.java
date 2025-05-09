package src.Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário
        // ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner in = new Scanner(System.in);
        double salario = in.nextDouble();
        final double SALARIO_MIN = 1293.20;

        double qtd_salarios_min = salario / SALARIO_MIN;
        System.out.printf("O usuário recebe %.1f salários mínimos", qtd_salarios_min);

    }
}
