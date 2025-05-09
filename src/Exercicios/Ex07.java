package src.Exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner in = new Scanner(System.in);
        boolean boolean1 = in.nextBoolean();
        boolean boolean2 = in.nextBoolean();

        String resposta;
        if (boolean1 && boolean2){
            resposta = "Os dois são verdadeiros";
        } else if ((boolean1 || boolean2)){
            resposta = "Um é veradadeiro e o outro é falso";
        } else {
            resposta = "Os dois são falsos";
        }
        System.out.println(resposta);
    }
}
