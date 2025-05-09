package src.Exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
        // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
        Scanner in = new Scanner(System.in);
        float media = 0;
        System.out.print("Escreva seu nome: ");
        String nomeAluno = in.next();
        System.out.println("Escreva suas 4 notas:");
        for (int i = 0; i < 4; i++) {
            float nota = in.nextFloat();
            media += nota;
        }
        media = media/4;
        String resposta;
        if (media >= 7){
            resposta = "aprovado";
        } else {
            resposta = "reprovado";
        }
        System.out.printf("O aluno %s foi %s com a nota %.1f\n", nomeAluno, resposta, media);
    }
}
