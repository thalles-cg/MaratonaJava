package Exercises.codewars.SortMyTextbooks;

import java.util.*;

import java.util.*;

class sorter {

    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream().sorted().toList();
    }
}