package src.OrientacaoAObjetos.ModificadorEstatico.test;

<<<<<<< HEAD
import src.OrientacaoAObjetos.ModificadorEstatico.dominio.Carro;
=======
import src.OrientacaoAObjetos.ModificadorEstatico.domain.Carro;
>>>>>>> 8235e11d2ec5394417181cb3dffda87853147705

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
