package timeanddate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeDemo2 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");

        String currentTime = format.format(time);
        System.out.println("Current Time: " + currentTime);

    }

}
