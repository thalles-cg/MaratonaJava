package src.OrientacaoAObjetos.Introducao.test;

import src.OrientacaoAObjetos.Introducao.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "gol";
        carro1.modelo = "volkswagen";
        carro1.ano = 2023;

        Carro carro2 = new Carro();

        carro2.nome = "onix";
        carro2.modelo = "chevrolet";
        carro2.ano = 2024;

        System.out.println("CARRO1\nnome: " + carro1.nome + "\nmodelo: " + carro1.modelo + "\nano: " + carro1.ano);
        System.out.println("==================");
        System.out.println("CARRO2\nnome: " + carro2.nome + "\nmodelo: " + carro2.modelo +"\nano: " + carro2.ano);
    }
}
