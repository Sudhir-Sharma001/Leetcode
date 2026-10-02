import java.time.LocalTime;
public class localtime {
        public static void main(String[] args) {
            LocalTime currentTime = LocalTime.now();
            System.out.println("Current Time: " + currentTime);
            System.out.println("Hour: " + currentTime.getHour());
            System.out.println("Minute: " +
                    currentTime.getMinute());
            System.out.println("Second: " +
                    currentTime.getSecond());
        }

}
