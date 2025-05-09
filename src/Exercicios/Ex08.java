package src.Exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) continue;
            if (nums[i] > nums[i-1]){ // 5, 3, 8
                int valorAnterior = nums[i-1]; // 3
                nums[i-1] = nums[i];
                nums[i] = valorAnterior;
                i = 0;
            }
        }
        for(int num : nums){
            System.out.print(num + " ");
        }

    }
}
