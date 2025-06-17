package Exercises.hackerrank.Palindrome.StringToken;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] strSplitted = s.trim().split("[^a-zA-Z]+");
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(strSplitted.length);
            for (String str : strSplitted){
                System.out.println(str);
            }
        }
        scan.close();
    }
}


