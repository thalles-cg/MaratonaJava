package Exercises.codewars.RemovingElements;
import java.util.*;

public class Kata {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello2"})));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        int qtdElements = 0;
        for (int i = 0; i < arr.length ; i++){
            if (i % 2 == 0) {
                arr[qtdElements++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, qtdElements);
    }


}
