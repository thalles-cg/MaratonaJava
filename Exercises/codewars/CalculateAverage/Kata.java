package Exercises.codewars.CalculateAverage;

import java.util.Arrays;

public class Kata {
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }
}