package Exercises.codewars.SmallestUnusedID;

import java.util.*;

public class Kata {

    public static void main(String[] args) {

        System.out.println(Kata.nextId(new int[]{0, 0, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 8, 8, 9, 10, 10, 11, 11, 11, 14}));

    }

    public static int nextId(int[] ids) {
        Set<Integer> set = new HashSet<>();
        for (int id : ids) {
            set.add(id);
        }
        for (int i = 0 ; i < set.size() ; i++){
            if (!set.contains(i)) return i;
        }
        return set.size();
    }

//    public static int nextId(int[] ids) {
//        Arrays.sort(ids);
//        int pos = 0;
//        for (int i = 0 ; i < ids.length ; i++){
//            if (ids[pos] < i) {
//                i -= 2;
//                continue;
//            }
//            if (ids[pos] != i) return i;
//            pos++;
//            if (pos == ids.length -1) return ids[ids.length -1] + 1;
//
//        }
//        return 0;
//    }
}