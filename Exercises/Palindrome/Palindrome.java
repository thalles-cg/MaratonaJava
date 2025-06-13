package Exercises.Palindrome;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int lastLetter = A.length() -1;

        int i = 0;
        boolean isPalindrome = true;
        while(i <= lastLetter){
            if (A.charAt(i++) == A.charAt(lastLetter--)){
            } else {
                isPalindrome = false;
                System.out.println("No");
                break;
            }
        }
        if (isPalindrome) System.out.println("Yes");
    }
}



