package Exercises.codewars.ExclamationMarkSeries6;

public class Kata {

    public static void main(String[] args) {

        System.out.println(Kata.remove("!", 2));

    }

    public static String remove(String s, int n){
        for (int i = 0 ; i < n ; i++){
            System.out.println("i:" + i + " s.contains() =" + s.contains("!"));
            if (s.contains("!")){
                System.out.println(s.indexOf("!"));
                s = s.substring(0, s.indexOf("!")) + s.substring(s.indexOf("!") + 1);
            } else {
                break;
            }
        }

        return s;

    }

}
