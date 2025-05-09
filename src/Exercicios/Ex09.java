package src.Exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com
        // a tabela abaixo:

        Scanner in = new Scanner(System.in);
        System.out.print("Escreva seu peso: ");
        double peso = in.nextDouble();
        System.out.print("Escreva sua altura: ");
        double altura = in.nextDouble();
        double IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f\n", IMC);
        String resposta = "";
        if (IMC <= 18.5){
            resposta = "Abaixo do peso";
        } else if (IMC > 18.5){
            resposta = "Peso ideal";
        } else if (IMC > 29.9){
            resposta = "Levemente acima do peso";
        } else if (IMC > 34.9) {
            resposta = "Obesidade Grau I";
        } else if (IMC > 39.9){
            resposta = "Obesidade Grau II";
        } else {
            resposta = "Obesidade Grau III";
        }
        System.out.println(resposta);
    }
}
