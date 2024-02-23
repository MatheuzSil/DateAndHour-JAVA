package CalcWithDateAndHour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-02-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T01:30");
        Instant d06 = Instant.parse("2024-02-22T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("d04 = "+ d04);
        System.out.println("Past week = " + pastWeekLocalDate);
        System.out.println("Next week =" + nextWeekLocalDate);

        System.out.println("-----------------------------------------------------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime nextHoutrLocalDateTime = d05.plusHours(10);
        LocalDateTime nextMinuteLocalDateTime = d05.plusMinutes(30);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);
        System.out.println(nextHoutrLocalDateTime);
        System.out.println(nextMinuteLocalDateTime);

        System.out.println("-----------------------------------------------------------------");


        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        System.out.println("-----------------------------------------------------------------");


        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());




    }
}
