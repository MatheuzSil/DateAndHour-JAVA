package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-02-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T01:30");
        Instant d06 = Instant.parse("2024-02-22T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.of("US/Pacific"));


        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + r1);


        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getMonthValue());
        System.out.println("d04 dia = " + d04.getYear());

        System.out.println("d04 dia = " + d05.getHour());
        System.out.println("d04 dia = " + d05.getMinute());









    }
}
