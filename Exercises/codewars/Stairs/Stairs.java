package Exercises.codewars.Stairs;

public class Stairs{
    public static String draw(int n){
        String spaces = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if (i == (n-1)){
                sb.append(spaces).append("I");
                continue;
            }
            sb.append(spaces).append("I\n");
            spaces+= " ";
        }
        return sb.toString();
    }
}
