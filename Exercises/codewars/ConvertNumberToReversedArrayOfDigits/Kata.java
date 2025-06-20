package Exercises.codewars.ConvertNumberToReversedArrayOfDigits;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.digitize(20025)));
        System.out.println(Arrays.toString(Kata.digitize2(20025)));
    }

    public static int[] digitize(long n) {
        char[] charNum = ("" + n).toCharArray();
        int[] nums = new int[charNum.length];

        int charIndex = charNum.length - 1;
        for (int i = 0 ; i < nums.length; i++){
            nums[i] = Character.getNumericValue(charNum[charIndex--]);
        }
        return nums;
    }
    public static int[] digitize2(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        int[] nums = new int[sb.length()];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Character.getNumericValue(sb.charAt(i));
        }
        return nums;
    }
}
