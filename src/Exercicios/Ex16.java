package src.Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        // 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
        // equilátero, isósceles ou escaleno.

        Scanner in = new Scanner(System.in);
        float valor1 = in.nextFloat();
        float valor2 = in.nextFloat();
        float valor3 = in.nextFloat();

        String tipoTriangulo = "Escaleno";
        if (valor1 == valor2 && valor2 == valor3){
            tipoTriangulo = "Equilátero";
        } else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
            tipoTriangulo = "Isósceles";
        }
        System.out.println("Esse triângulo é: " + tipoTriangulo);

    }
}
