package Exercises.codewars.isYourPeriodLate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class PeriodTime {

    public static void main(String[] args) {

        System.out.println(PeriodTime.periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));

    }

    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
        return ChronoUnit.DAYS.between(last, today) > cycleLength;
    }
}