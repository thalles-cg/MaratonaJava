package src.Classes_Utilitarias.Scanner.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {

        String texto = "Levi, Eren, Mikasa, true, 100,2";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(", ");
        while(sc.hasNext()){
            if (sc.hasNextInt()){
                System.out.println(sc.next() + " é um inteiro");
            } else if(sc.hasNextBoolean()){
                System.out.println(sc.next() + " é um boolean");
            } else if(sc.hasNextDouble()){
                System.out.println(sc.next() + " é um double");
            } else {
                System.out.println(sc.next() + " é uma String");
            }
        }
    }
}