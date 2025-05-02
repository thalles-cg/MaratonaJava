package src.IntroducaoMetodos.teste;

import src.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraDesafio {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        // Criar uma calculadora que valida se um número é primo e retornar um valor boolean
        for (int i = 0; i < 25; i++) {
            if (calculadora.verificaPrimo(i)){
                System.out.println("O número " + i + " é primo");
                continue;
            }
            System.out.println("O número " + i + " não é primo");
        }
        // Criar uma calculadora que recebe uma lista/array e retorne toda a lista * 2.
        int[] numArray = {2, 5, 7, 10, 12};
        calculadora.dobrarArray(numArray);

    }
}
