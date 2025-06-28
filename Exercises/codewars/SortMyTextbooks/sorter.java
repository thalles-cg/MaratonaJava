package Exercises.codewars.SortMyTextbooks;

import java.util.*;

class sorter {

    public static List<String> sort(List<String> textbooks) {
        if (textbooks == null) return null;
        List<String> sorted = new ArrayList<>(textbooks);
        sorted.sort(String.CASE_INSENSITIVE_ORDER);
        return sorted;
    }
}