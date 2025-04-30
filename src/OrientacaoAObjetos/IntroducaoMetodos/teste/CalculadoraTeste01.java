package src.OrientacaoAObjetos.IntroducaoMetodos.teste;

import src.OrientacaoAObjetos.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        /*
        Metodo: executa uma ação da classe.
        Parâmetro são os valores necessários para inicialização de um método
        Argumentos são os valores que serão inseridos nos parâmetros durante sua chamada, já que parâmetros são genéricos

        Uma regra para deixar os métodos mais coesos é não dar muitas funcionalidades pra ele. Se em um metodo há a presença de mais de 3 parâmetros, é um
        bom sinal de que deveriam ter outros métodos ao invés de todos concentrados em apenas um.
         */

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 3);

    }
}
