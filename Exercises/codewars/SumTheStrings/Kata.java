package Exercises.codewars.SumTheStrings;

public class Kata{
    public static String sumStr(String a, String b){
        int num1 = 0;
        int num2 = 0;

        if (!a.isEmpty()){
            num1 = Integer.parseInt(a);
        }
        if (!b.isEmpty()){
            num2 = Integer.parseInt(b);
        }
        return String.format("%d", (num1 + num2));
    }
}
