package Exercises.codewars.FindTheSmallestIntegerInArray;

import java.util.Arrays;

public class SmallestIntegerFinder {

    public static void main(String[] args) {
        System.out.println(SmallestIntegerFinder.findSmallestInt(new int[]{1,2,45,34,2,2,4,5}));

    }

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
