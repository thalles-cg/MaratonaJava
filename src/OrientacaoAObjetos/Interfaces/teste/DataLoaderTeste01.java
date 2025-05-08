package src.OrientacaoAObjetos.Interfaces.teste;

import src.OrientacaoAObjetos.Interfaces.dominio.DataLoader;
import src.OrientacaoAObjetos.Interfaces.dominio.DatabaseLoader;
import src.OrientacaoAObjetos.Interfaces.dominio.FileLoader;

import javax.xml.crypto.Data;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        databaseLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
