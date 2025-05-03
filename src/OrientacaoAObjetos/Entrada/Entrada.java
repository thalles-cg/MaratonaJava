package src.OrientacaoAObjetos.Entrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Previsão irada");
        String resposta = "";
        while(!resposta.equalsIgnoreCase("pare")){
            System.out.println("Escreva algo e receberás uma previsão");
            resposta = in.nextLine();
            if (resposta.charAt(0) == ' '){
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
            try {
                Thread.sleep(2000); // Delay for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
