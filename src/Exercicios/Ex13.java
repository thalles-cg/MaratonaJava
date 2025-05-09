package src.Exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        //  13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = in.next();
        System.out.print("Escreva sua idade: ");
        int idade = in.nextInt();

        String isAdulto = "menor de idade";
        if (idade >= 18){
            isAdulto = "maior de idade";
        }

        System.out.println(nome + " é " + isAdulto);
    }
}
