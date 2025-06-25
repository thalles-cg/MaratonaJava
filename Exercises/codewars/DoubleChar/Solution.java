package Exercises.codewars.DoubleChar;

public class Solution{
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
