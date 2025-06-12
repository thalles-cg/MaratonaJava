package src.Classes_Utilitarias.IO.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try {

            boolean exists = file.exists();
            if (exists){
                file.delete();
            } else {
                file.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Caminho: " + file.getPath());
        System.out.println("Caminho absoluto: " + file.getAbsolutePath());

        File src = new File("C:\\MaratonaJava\\src");
        File[] fileList = src.listFiles();

        for (File element : fileList){
            System.out.println(element.getName());
        }

        System.out.println("src é um arquivo? " + src.isFile()); // -> para retornar true ele tem que existir
        System.out.println("src é uma pasta? " + src.isDirectory());

        System.out.println("file é um arquivo? " + file.isFile());
        System.out.println("file é uma pasta? " + file.isDirectory());

    }
}
