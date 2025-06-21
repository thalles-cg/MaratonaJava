package Exercises.codewars.LarioAndMuigiPipeProblem;


import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.pipeFix(new int[] {1,2,3,5,6,8,9})));
    }

    public static int[] pipeFix(int[] numbers) {
        int newLength = numbers[numbers.length - 1] - numbers[0] + 1;
        int[] newArr = Arrays.copyOf(numbers, newLength);
        for (int i = 0 ; i < newArr.length ; i++){
            newArr[i] = numbers[0] + i;
        }
        return newArr;
    }
}
