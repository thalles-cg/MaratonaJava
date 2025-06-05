package src.Classes_Utilitarias.Strings.teste;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome = "Thalles";
        String nome2 = "Thalles";
        String nome3 = in.next(); // Mesmo inserindo "Thalles" dentro do input do scanner, o boolean 'isEndereçoIgual2' vai ser false

        boolean isEnderecoIgual = nome == nome2;
        System.out.println("Sem scanner: " + isEnderecoIgual); // Retorna true

        boolean isEnderecoIgual2 = nome == nome3;
        System.out.println("Com scanner: " + isEnderecoIgual2); // Retorna false

    }
}
