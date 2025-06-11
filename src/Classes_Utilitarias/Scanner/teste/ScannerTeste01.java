package src.Classes_Utilitarias.Scanner.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {

        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split(","); //O argumento é um regex

        for(String nome : nomes){
            System.out.println(nome.trim());
        }


    }
}
