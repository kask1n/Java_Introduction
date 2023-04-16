//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

class Java_Seminar1_CW_Task0 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm:ss");
        System.out.println(formatter.format(now));
    }
}