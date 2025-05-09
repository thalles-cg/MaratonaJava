package src.Exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        // 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.

        Scanner in = new Scanner(System.in);
        float temperaturaFahrenheit = in.nextFloat();

        float celsius = (5 * (temperaturaFahrenheit - 32)/9);
        System.out.printf("A temperatura %.1f é igual a graus %.1f Celsius", temperaturaFahrenheit, celsius);
    }
}
