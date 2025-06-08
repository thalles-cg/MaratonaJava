package src.Classes_Utilitarias.Datas.teste;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime tempo = LocalTime.of(23, 42, 12); // As horas não passam de 24 e os minutos e segundos não passam de 60
        System.out.println(tempo);
    }
}
