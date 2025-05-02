package src.IntroducaoMetodos.teste;

import src.IntroducaoMetodos.dominio.Calculadora;

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


        // Uma regra importante sobre o metodo, é que quando ele recebe um argumento do tipo primitivo para ser alterado dentro dele, se o metodo não retornar a
        // variável de volta, ela se manterá como foi inicializada na main.
        // Já quando é para objetos no argumento, ele copia um endereço na memória, podendo assim alterar alguns atributos do objeto. Porém, quando tentamos
        // criar um outro ponto de referência com base no mesmo objeto que estava no parâmetro, ele não altera o objeto da main.
    }
}
