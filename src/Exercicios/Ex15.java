package src.Exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        // consideração o ano com 365 dias e o mês com 30 dias.
        // (Ex: 5 anos, 2 meses e 15 dias de vida)

        Scanner in = new Scanner(System.in);
        System.out.print("Escreva o ano em que nasceu: ");
        int anoNascimento = in.nextInt();
        int anoAtual = 2025;

        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias =  idadeMeses * 365;

        System.out.printf("Você viveu %d anos, %d meses e %d dias", idadeAnos, idadeMeses, idadeDias);
    }
}
