package src.Classes_Utilitarias.Datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDate date = LocalDate.parse("2024-02-12");
        LocalTime time = LocalTime.of(12, 23, 45);

        LocalDateTime dataHora = date.atTime(time);

        System.out.println(dataHora);
    }
}
