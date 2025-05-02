package src.IntroducaoMetodos.teste;

import src.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // Esse cálculo foi feito usando varArgs. varArgas nada mais é do que uma forma de mandar um conjunto de número dentro do argumento para
        // envia-lo dentro do metodo como um array.
        calculadora.somarArray(2,3,5,6,7,7,5);

        int[] numArray = {2,6,4,3,2};
        calculadora.somarArray(numArray);

    }
}
