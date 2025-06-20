package Exercises.codewars.CSVRepresentationOfArray;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Kata.toCsvText(new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 } }));
    }

    public static String toCsvText(int[][] array){
        StringBuilder sb = new StringBuilder();

        for (int[] ints : array) {
            for (int anInt : ints) {
                sb.append(anInt).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() -1);
        return sb.toString();
    }
}
