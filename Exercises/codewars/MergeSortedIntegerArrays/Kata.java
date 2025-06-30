package Exercises.codewars.MergeSortedIntegerArrays;

import java.util.*;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        ArrayList<Integer> mergedArr = new ArrayList<>();

        for (int num : first) {
            mergedArr.add(num);
        }
        for (int num : second) {
            mergedArr.add(num);
        }
        Set<Integer> set = new TreeSet<>(mergedArr);
        int[] result = new int[set.size()];

        int index = 0;
        for (Integer num : set){
            result[index++] = num;
        }
        return result;
    }
}
