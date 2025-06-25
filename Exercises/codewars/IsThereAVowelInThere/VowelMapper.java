package Exercises.codewars.IsThereAVowelInThere;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VowelMapper {

    public static List<Object> isVow(List<Integer> a) {
        List<Object> b = new ArrayList<>();
        for (Integer num : a) {
            switch (num) {
                case 97 -> b.add("a");
                case 101 -> b.add("e");
                case 105 -> b.add("i");
                case 111 -> b.add("o");
                case 117 -> b.add("u");
                default -> b.add(num);
            };
        }
        return b;
    }
}
