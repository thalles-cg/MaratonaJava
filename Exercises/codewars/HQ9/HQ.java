package Exercises.codewars.HQ9;

public class HQ {
    public static String HQ9(char code) {

        if (code == 'H') return "Hello World!";
        if (code == 'Q') return String.valueOf(code);
        if (code == '9') {
            StringBuilder sb = new StringBuilder(8000);
            for (int i = 99; i >= 3; i--) {
                sb.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n");
                sb.append("Take one down and pass it around, ").append(i - 1).append(" bottles of beer on the wall.\n");
            }
            sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n");
            sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n");
            sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
            sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
            sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
            sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
            return sb.toString();
        }
        return null;
    }
}
