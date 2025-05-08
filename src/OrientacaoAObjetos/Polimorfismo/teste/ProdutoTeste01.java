package src.OrientacaoAObjetos.Polimorfismo.teste;

import src.OrientacaoAObjetos.Polimorfismo.dominio.Computador;
import src.OrientacaoAObjetos.Polimorfismo.dominio.Tomate;
import src.OrientacaoAObjetos.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Bom", 10);

//        CalculadoraImposto.calcularImpostoComputador(computador);
//        CalculadoraImposto.calcularImpostoTomate(tomate);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
