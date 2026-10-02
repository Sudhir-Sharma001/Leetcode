import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current Date and Time: " + now);
//        LocalDateTime dt =LocalDateTime.of(2026, 10, 5, 10, 30);
//        System.out.println("Specific Date and Time: " + dt);
//        System.out.println("Year: " + dt.getYear());
//        System.out.println("Month: " + dt.getMonth());
//        System.out.println("Day: " + dt.getDayOfMonth());
//        System.out.println("After 5 Days: " + dt.plusDays(5));
//        System.out.println("Before 2 Hours: "+ dt.minusHours(2));
//        System.out.println("Only Date: "+ dt.toLocalDate());
//        System.out.println("Only Time: " + dt.toLocalTime());
    }
}