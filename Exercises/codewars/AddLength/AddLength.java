package Exercises.codewars.AddLength;

public class AddLength{

    public static String[] addLength(String str){
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] += " " + strArray.length;
        }

        return strArray;
    }

}
