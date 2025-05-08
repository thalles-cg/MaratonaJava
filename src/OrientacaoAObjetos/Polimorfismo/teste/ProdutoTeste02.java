package src.OrientacaoAObjetos.Polimorfismo.teste;

import src.OrientacaoAObjetos.Polimorfismo.dominio.Computador;
import src.OrientacaoAObjetos.Polimorfismo.dominio.Produto;
import src.OrientacaoAObjetos.Polimorfismo.dominio.Tomate;
import src.OrientacaoAObjetos.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021"); // dataValidade é um atributo exclusivo do tomate. Isso pode dificultar se for necessário utilizar a dataValidade em algum
        // método_ do Produto, pois produto não tem dataValidade, então não há como pegar com um produto.getDataValidade() por exemplo

        CalculadoraImposto.calcularImposto(tomate);
    }
}
