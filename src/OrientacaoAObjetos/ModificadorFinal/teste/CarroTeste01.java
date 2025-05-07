package src.OrientacaoAObjetos.ModificadorFinal.teste;

import src.OrientacaoAObjetos.ModificadorFinal.dominio.Carro;
import src.OrientacaoAObjetos.ModificadorFinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        // carro.COMPRADOR = comprador; -> Isso não é possível, pois essa não é o comprador criado no carro
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Robson");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Julio");
        System.out.println(carro.COMPRADOR);

    }
}
