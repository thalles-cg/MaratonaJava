package src.Classes_Utilitarias.Datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        Period.of()
    }
}
