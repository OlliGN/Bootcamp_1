package date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Today {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //of(yyyy,mm,dd);
        LocalDate dob = LocalDate.of(1994, 2, 11);
        System.out.println(dob);

        LocalDate subscriptionDate = LocalDate.now();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime transactionTime = LocalDateTime.of(2010, 2, 21, 23, 34, 11);
        System.out.println(transactionTime);

        LocalDate local = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(formatter.format(local));

        //yyyy
        //yy
        //mm
        //dd - days of the means
        //DD days of the year
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(formatter2.format(local));

        LocalDate dob1 = LocalDate.of(1990, Month.APRIL, 20);
        Period period = Period.between(dob1, local);
        System.out.println(period.getYears());

        Duration d = Duration.between(LocalDateTime.now(),LocalDateTime.now().plusHours(1));
        System.out.println(d.getSeconds());
        System.out.println(d.toHours());

    }
}
