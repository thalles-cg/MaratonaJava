package src.Classes_Utilitarias.Datas.teste;

import java.time.Instant;

public class InstantTeste01 {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(1999999999));

    }
}
