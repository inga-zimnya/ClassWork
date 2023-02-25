import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setYear(2023);
        d1.setMonth(Calendar.FEBRUARY);
        d1.setDate(2);

        System.out.println(d1);
        System.out.println(d1.getYear());
        System.out.println(d1.getMonth());
        System.out.println(d1.getDay());

        Instant now = Instant.now();
        Instant future = Instant.ofEpochMilli(1680453611000L);
        future.equals(now);
        future.plusMillis(1234);
        future.plus(1, ChronoUnit.DAYS);
        now.isBefore(future);

        LocalDate ld = LocalDate.ofYearDay(2023, 76);
        System.out.println(ld);


    }
}
