package src.Classes_Utilitarias.IO.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("DevDojo é bom");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
