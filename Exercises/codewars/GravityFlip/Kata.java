package Exercises.codewars.GravityFlip;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.flip('R', new int[]{ 3,2,1,2 })));
        System.out.println(Arrays.toString(Kata.flip('L', new int[]{ 1,4,5,3,5 })));


    }

    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);
        if(dir == 'R'){
            return arr;
        }
        for (int i = 0; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
        return arr;
    }
}
