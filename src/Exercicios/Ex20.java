package src.Exercicios;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        // 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = in.nextInt();

        System.out.println("================\nTabuado do " + valor + "\n-------------------");
        for (int i = 1; i <= 10 ; i++) {
            int mult = valor * i;
            System.out.println(valor + "X" + i + " = " + mult );
        }
    }
}
