package date;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateTesting {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2025, 12, 15);
        LocalDate date3 = LocalDate.parse("2025-12-22");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        LocalTime time1 = LocalTime.of(20, 15);
        System.out.println(time1);

        ZoneId zoneId = ZoneId.of("America/Phoenix");
        LocalTime time3 = LocalTime.now(zoneId);
        System.out.println(time3);


        LocalTime time2 = LocalTime.parse("23:59:59");
        System.out.println(time2);

        LocalDate date4 = LocalDate.parse("2025-12-22");
        Period period1 = Period.of(3, 5, 10);
        if (date2.minus(period1).isBefore(date4)) {
            LocalDate result = date2.minus(period1);
            System.out.println(result);
        }

        Period period2 = Period.of(1, 1, 5);
        Period result = period1.minus(period2);
        System.out.println(result);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Europe/Chisinau"));
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String stringDate = zonedDateTime.format(dateTimeFormatter);
        System.out.println(stringDate);

        Locale locale = Locale.forLanguageTag("ro-RO");
        Chronology c = Chronology.ofLocale(locale);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale).withChronology(c);
        String zonedString = zonedDateTime.format(f);
        System.out.println(zonedString);


        ZonedDateTime convertedTime = ZonedDateTime.parse("miercuri, 23 aprilie 2025, 20:05:45 Ora de vară a Europei de Est", f);
        System.out.println(convertedTime);

        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("yyyyMMdd hh:mm");
        String customResult = localDateTime.format(customFormat);
        System.out.println(customResult);

    }
}
