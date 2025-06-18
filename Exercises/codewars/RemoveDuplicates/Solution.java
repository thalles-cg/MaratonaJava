package Exercises.codewars.RemoveDuplicates;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.distinct(new int[]{1, 0, 2, 4, 6, 2, 4, 3, 0})));
    }

    public static int[] distinct(int[] array){

        return Arrays.stream(array).distinct().toArray();
    }
//    public static int[] distinct(int[] array){
//        int qtdElements = 0;
//        boolean isZeroIn = false;
//        int[] arr2 = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            boolean alreadyExist = false;
//            for (int j = 0; j < array.length; j++) {
//                if (arr2[j] == array[i]){
//                    alreadyExist = true;
//                }
//                if (array[i] == 0){
//                    if (!isZeroIn) arr2[qtdElements++] = 0;
//                    isZeroIn = true;
//                }
//            }
//            if (alreadyExist) continue;
//            arr2[qtdElements++] = array[i];
//        }
//        return Arrays.copyOf(arr2, qtdElements);
//    }
}