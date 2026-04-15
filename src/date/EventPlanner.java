package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EventPlanner {
    public static void main(String[] args) {
        LocalDate eventDate = LocalDate.of(2025, 5, 25);
        LocalTime eventTime = LocalTime.of(18, 30);
        LocalDateTime eventDateTime = LocalDateTime.of(eventDate, eventTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy, HH:mm");
        System.out.println("Evenimentul este programat pentru: " + eventDateTime.format(formatter));

        LocalDate today = LocalDate.now();
        Period untilEvent = Period.between(today, eventDate);
        System.out.println("Mai sunt " + untilEvent.getMonths() + " luna si " + untilEvent.getDays() + " zile pina la eveniment");

        System.out.println("Ora evenimentului este: " + eventTime);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Ora in format de 12h: " + eventTime.format(timeFormatter));
    }
}
