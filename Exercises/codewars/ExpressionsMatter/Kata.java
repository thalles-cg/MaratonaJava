package Exercises.codewars.ExpressionsMatter;

public class Kata {
    public static int expressionsMatter(int a, int b, int c){
        if ((a == 1 && c == 1) || (a == 1 && b == 1 && c == 1)) return a + b + c;
        if (a == 1 || b == 1 || c == 1) return Math.max((a+b)*c, a * (b+c));

        return a * b * c;
    }
}
