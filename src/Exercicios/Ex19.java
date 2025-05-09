package src.Exercicios;

public class Ex19 {
    public static void main(String[] args) {
        // 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println("TABUADA DO " + i +"\n-------------------");
            for (int j = 1; j <= 10; j++) {
                float mult = i * j;
                System.out.println(i + "X" + j + " = " + mult);
            }
            System.out.println("===============");
        }
    }
}
