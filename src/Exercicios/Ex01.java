package src.Exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        double somaAB = A + B;
        System.out.println("Soma de " + A + " e " + B + " é igual a: "+ somaAB);

        String resposta = "";
        if (somaAB < C){
            resposta = "Soma é menor que C";
        } else {
            resposta = "Soma é maior que C";
        }

        System.out.println(resposta);
    }
}
