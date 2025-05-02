package src.ModificadorEstatico.test;

import src.ModificadorEstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        carro.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
