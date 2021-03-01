package timeanddate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(format);//return String Value
        System.out.println("Current Time: " + currentTime);

    }

}
