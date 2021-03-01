package timeanddate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateformat.format(date); //return String Value
        System.out.println("Current Date: " + currentDate);

    }

}
